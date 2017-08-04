/*

console.log(a);	

a = 2;
var a;


var a = 2;

var foo = function(a){
	a = 10;
	console.log(a);
}
foo(a);

console.log(a);


function foo(a) {
	console.log( a + b );
}

var b = 2;

foo( b ); //

*/

function foo(a) {
	

	function bar(c) {
		console.log( a, b, c );
	}

	bar(b * 3);
}
var a;
var b;

foo( 2 ); 
b=10;

