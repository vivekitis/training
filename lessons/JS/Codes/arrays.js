var numbers = [1, 2, 3, 4, 5];
var newNumbers = [];
for(var i = 0; i < numbers.length; i++) {
    newNumbers[i] = numbers[i] * 2;
}
console.log(newNumbers);


var numbers = [1, 2, 3, 4, 5];
var output = numbers.map(function(element) {
	return element * 2;
});

console.log(output);




var numbers = [1, 2, 3, 4, 5];
var newNumbers = [];
for(var i = 0, j=0; i < numbers.length; i++) {
	if(numbers[i] > 3) {
		newNumbers[j] = numbers[i];
		j++;
	}
}
console.log(newNumbers);



var numbers = [1, 2, 3, 4, 5];
var output = numbers.filter(function(element) {
	return element > 3;
});

console.log(output);


var numbers = [1, 2, 3, 4, 5];
var sum = 0;
for(var i = 0, j=0; i < numbers.length; i++) {
	sum = sum + numbers[i];
}
console.log(sum);

var numbers = [1, 2, 3, 4, 5];
var output = numbers.reduce(function(sum, element) {
	return sum + element;
}, 0);

console.log(output);
	
// //



var numbers = [1, 2, 3, 4, 5];
var output = numbers
		.map(function (element) {
			return element * 2;
		})
		.filter(function (element) {
			return element % 4 == 0;
		})
		.reduce(function(result , element) {
			return result * element;
		}, 1);

console.log(output);



var obj = { a: 1 };
var copy = Object.assign({}, obj);
console.log(obj); // { a: 1 }


var o1 = { a: 1 };
var o2 = { b: 2 };
var o3 = { c: 3 };

Object.assign(o1, o2, o3);
console.log(o1);



var arr = ['a', 'b', 'c'];
console.log(Object.keys(arr)); 
console.log(Object.values(arr));

// array like object
var obj = { 0: 'a', 1: 'b', 2: 'c' };
console.log(Object.keys(obj)); 
console.log(Object.values(obj));
// array like object with random key ordering
var anObj = { 100: 'a', 2: 'b', 7: 'c' };
console.log(Object.keys(anObj)); 
console.log(Object.values(anObj));

var obj = {
  t1: function() {},
  t2: 'bar'
};

obj.t3 = 't3';
obj.t4 = '1';
console.log(obj);
delete obj.t3;
console.log(obj);
Object.freeze(obj);
delete obj.t4;
console.log(obj);


