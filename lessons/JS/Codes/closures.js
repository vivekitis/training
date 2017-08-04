

/*
var digit_name = function(index) {
  var names = [
    "zero", "one", "two", "three", "four", "five",
    "six", "seven", "eight", "nine", "ten"  
  ];
  return names[index];
}	

console.log(digit_name(1));
*/
/*

var digit_name = function(index) {
	var names = [
		"zero", "one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine", "ten"	
	];
	return names[index];
}	

console.log(digit_name(1));
*/


var digit_name = (function(index) {

	var names = [
		"zero", "one", "two", "three", "four", "five",
		"six", "seven", "eight", "nine", "ten"	
	];
	return function(index) {
		return names[index];
	}
}());	

console.log(digit_name(1));




function makeAdder(x) {
  var x = x || 10;
  return function(y) {
    return x + y;
  };
}
//store different lexical environments
var add5 = makeAdder();
var add10 = makeAdder(10);

console.log(makeAdder(5)(10));
console.log(add5(2)); // 7
console.log(add10(2)); // 12


/*

var makeCounter = function() {
  var privateCounter = 0;
  function changeBy(val) {
    privateCounter += val;
  }
  return {
    increment: function() {
      changeBy(1);
    },
    decrement: function() {
      changeBy(-1);
    },
    value: function() {
      return privateCounter;
    }
  }  
}

var counter1 = makeCounter();
var counter2 = makeCounter();

counter1.increment();
counter1.increment();
console.log(counter1.value());
counter1.decrement();
counter2.decrement();

console.log(counter1.value()); 
console.log(counter2.value());

*/


var a = {};
for(var i = 0; i < 3; i++) {
a[i] = (function(){  
console.log(i);
})(i);
}
a[0]();
a[1]();
a[2]();


