

// var x = function(){
// 	console.log('This is inside Function X');
// }

// var y = function (callback) {
// 	console.log('This is inside Function y');
// 	callback();
// }

// y(x);






// SYNC CALLBACKS
// [1,2,3,4].forEach(function(element){
// 	console.log(element);
// });
// console.log('HERE');




//ASYNC callbacks
 
setTimeout(function(){
	console.log('Later');
},0);
console.log('Now');


