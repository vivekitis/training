'use strict';


function CheckBrowser() {
    if ('localStorage' in window && window['localStorage'] !== null) {
        return true;
    } else {
        return false;
    }
}

function doShowAll() {
    if (CheckBrowser()) {
        var key = "";
        var list = "<tr><th>A</th><th>B</th><th>C</th></tr>\n";
        var i = 0;
        for (i = 0; i <= localStorage.length - 1; i++) {
            key = localStorage.key(i);
            list += "<tr><td>" + key + "</td>\n<td>" + localStorage.getItem(key) + "</td>\n<td>" + localStorage.getItem(key) + "</td></tr>\n";
        }
        if (list == "<tr><th>A</th><th>B</th><th>C</th></tr>\n") {
            list += "<tr><td><i>empty</i></td>\n<td><i>empty</i></td></tr>\n";
        }
        document.getElementById('list').innerHTML = list;
    } else {
        alert('No support for LC !!!!');
    }
}

var ele = document.getElementById('list');
var ele2 = document.getElementById('main');

ele.addEventListener("click", function(e) {
    console.log(e);
    e.target.setAttribute("contenteditable", true);
});

ele2.addEventListener('keydown', function(e) {
    if (e.keyCode == 13) {
        e.target.setAttribute("contenteditable", false);
        localStorage.setItem(Number(e.target.previousElementSibling.innerText), Number(e.target.innerText));
    }
});