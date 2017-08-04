function multiply(a, b){
	return a*b;
}
function square(n) {
	return multiply(n, n);
}
function printSquare(n){
	return square(n, n);
}

printSquare(5);


//--------------------------

function foo(){
	return foo();
}
foo();



//--------------------------
//Diagram

setTimeout(function(){
	console.log('Here');
}, 500);
console.log('THere');

