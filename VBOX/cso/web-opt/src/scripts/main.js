(function () {

  var $countryList = $("#country-list");
  var $contentInfo = $("#content-info");

  var addCountryToList = function (country) {
    var div = document.createElement("div");
    var flag = document.createElement("span");
    var name = document.createElement("span");

    $(div).addClass("list_item");
    $(div).attr("tabindex", "-1");
    $(div).data("guid", country.guid);

    $(flag).addClass("list_item_avatar country country-" + country.guid);

    $(name).addClass("list_item_label typo typo-p");
    $(name).text(countryHelper.getName(country.guid));

    $(div).append(flag);
    $(div).append(name);
    $countryList.append(div);
  };

  var countryInfoEmpty = function () {
    $contentInfo.text("Nah, try something else.");
  };

  var countryListOnClick = function () {
    $(this).addClass("list_item-active").siblings().removeClass("list_item-active");

    countryHelper.getInfo($(this).data("guid")).then(function (info) {
      info ? $contentInfo.text(JSON.stringify(info, null, 2)) : countryInfoEmpty();
    }).catch(countryInfoEmpty);
  };

  var countryListOnMouseEnter = function () {
    $(this).addClass("list_item-hover");
  };

  var countryListOnMouseLeave = function () {
    $(this).removeClass("list_item-hover");
  };

  _.each(countryHelper.getAll(), addCountryToList);

  $countryList.on({
    click: countryListOnClick,
    mouseenter: countryListOnMouseEnter,
    mouseleave: countryListOnMouseLeave
  }, ".list_item");

}());
