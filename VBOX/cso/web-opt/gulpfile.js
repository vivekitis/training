var gulp = require("gulp");
var gulpLoadPlugins = require("gulp-load-plugins");
var del = require("del");
var runSequence = require("run-sequence");

var $ = gulpLoadPlugins();

gulp.task("styles", function () {

  return gulp.src([
    "./node_modules/normalize.css/normalize.css",
    "./src/styles/countries-sprite.css",
    "./src/styles/main.css"
  ])
  .pipe($.concat("main.css"))
  .pipe($.cssnano({ safe: true, autoprefixer: false }))
  .pipe(gulp.dest("./build/styles"));

});

gulp.task("scripts", function () {
  return gulp.src([
    "./node_modules/underscore/underscore.js",
    "./node_modules/jquery/dist/jquery.js",
    "./src/scripts/countries.js",
    "./src/scripts/helpers.js",
    "./src/scripts/main.js"
  ])
  .pipe($.concat("main.js"))
  .pipe($.uglify())
  .pipe(gulp.dest("./build/scripts"));
});

gulp.task("images", function () {
  return gulp.src("./src/images/countries/sprite.svg")
  .pipe($.cache($.imagemin()))
  .pipe(gulp.dest("./build/images/countries"));
});

gulp.task("html", ["scripts", "styles"], function () {
  return gulp.src("./src/index.html")
  .pipe($.if("*.html", $.htmlmin({ collapseWhitespace: true })))
  .pipe(gulp.dest("./build"));
});

gulp.task("clean", del.bind(null, [".tmp", "build"]));

gulp.task("build", ["html", "images"], () => {
    return gulp.src("build/**/*").pipe($.size({ title: "build", gzip: true }));
});

gulp.task("default", () => {
    return new Promise(resolve => {
        dev = false;
        runSequence(["clean"], "build", resolve);
    });
});
