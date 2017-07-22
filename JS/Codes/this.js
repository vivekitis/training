
 function identify(){
	this.name = 'as';
	return this.name.toUpperCase();
}

function speak(){
	console.log(this);
	console.log(identify.apply(this));
	console.log(this);
}


var me = {
	name : 'Vedant'
};


speak.apply(me);


//

/*
function foo(num) {
	console.log( "foo: " + num );
	// keep track of how many times `foo` is called
	foo.count++;
}
foo.count = 0;
var i;
for (i=0; i<10; i++) {
	if (i > 5) {
		foo( i ); // foo, [i]
	}
}
console.log(foo.count);	

*/





/*
function baz() {
    // call-stack is: `baz`
    // so, our call-site is in the global scope

    console.log( "baz" );
    bar(); // <-- call-site for `bar`
}

function bar() {
    // call-stack is: `baz` -> `bar`
    // so, our call-site is in `baz`

    console.log( "bar" );
    foo(); // <-- call-site for `foo`
}

function foo() {
    // call-stack is: `baz` -> `bar` -> `foo`
    // so, our call-site is in `bar`

    console.log( "foo" );
}

baz(); // <-- call-site for `baz`

*/


//Default Binding 

/*
function foo() {
	console.log( this.a );
}

var a = 2;

foo(); // 2

*/

// //Implicit Binding

/*
function foo() {
	console.log( this.a );
}

var obj = {
	a: 2,
	foo: foo
};

obj.foo(); // 2

*/


// //Explicit Binding

/*
function foo() {
	console.log( this.a );
}

var obj = {
	a: 2
};

foo.apply( obj ); // 2
*/
// //Hard Binding

/*
function foo() {
	console.log( this.a );
}

var obj = {
	a: 2
};

var bar = function() {
	foo.call( obj );
};

bar(); // 2
setTimeout( bar, 100 ); // 2
*/
// // `bar` hard binds `foo`'s `this` to `obj`
// // so that it cannot be overriden
// bar.call( window ); // 2



//Hard Bdining bind



/*function foo(something) {
	console.log( this.a, something );
	return this.a + something;
}

var obj = {
	a: 2
};

var bar = foo.bind( obj );

var b = bar( 3 ); // 2 3
console.log( b ); // 5
*/


/*
function getName(g) {
	console.log(this);
};

o = {name:'Audi', getName:getName };

function Car(name) {
  this.name = name;
  this.getName = function(){
	console.log(this);
	return this.name
  }
}

c = new Car("honda");
getName(); // Global function scope
o.getName(); // object scope
c.getName(); // new object scope

*/





