
function sync() {
	var cb = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       document.getElementById("demo").innerHTML = document.getElementById("demo").innerHTML + xhttp.responseText;
	       console.log('Got response');
	    }
	};
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = cb;
	xhttp.open("GET", "todo.php", false);
	xhttp.send();

	var xhttp2 = new XMLHttpRequest();
	xhttp2.onreadystatechange = cb;
	xhttp2.open("GET", "todo.php", false);
	xhttp2.send();
	
}

