a = 2;
var a;
console.log( a );







//--------------------------

console.log( a );
var a = 2;
//--------------------------

foo();

function foo() {
	console.log( a ); 

	var a = 2;
}
//--------------------------


var foo = function () {
	console.log('HEre');
};

foo(); 

//--------------------------
foo(); 


function foo() {
	console.log( 1 );
}

foo = function() {
	console.log( 2 );
};
function foo() {
	console.log( 3);
}
foo();

//--------------------------


foo();
var a = true;
if (a) {
   function foo() { console.log( "a" ); }
}
else {
   function foo() { console.log( "b" ); }
}


// 

//

var a = 2;
b = 1;

function f(z) {
	b = 3;
	c = 4; 
	var d = 6;
	e = 1;
	function g() {
		var e = 0;
		d = 3 * d;
		return d;
	} 
	return g();
	var e;
}
console.log(f(1));
console.log(b);
console.log(c);
console.log(d);



	
//-----------------

var a = 2;
b = 1;
function f(z) {
	b = 3;
	c = 4; //global scope
	var d = 6;
	e = 1;
	function g() {
		var e = 0;
		d = 3 * d;
		return d;
	} 
	return g;
	var e;
}
var myG = f(1);
myG();


var a = 1;
function b() {
	a = 10;
	return;
	function a(){
	}
}
b(); console.log(a);






