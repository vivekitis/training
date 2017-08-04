/*
function talk(sound) {
	console.log(sound);
}

talk('Hi');

-----------------

function talk(){
	console.log(this);
}

talk();
*/


//-----------------

function talk() {
	console.log(this);
	console.log(this.sound);
}
var animal = {
	talk : talk
}
animal.talk();

//-------------------


function talk() {
	console.log(this);
	console.log(this.sound);
}
var animal = {
	talk : talk
}
var cat = {
	sound : 'meow!'
}

Object.setPrototypeOf(cat, animal);
console.log(cat.prototype);
cat.talk();

//------------------


function talk() {
	console.log(this.sound);
}
var animal = {
	talk : talk
}
var cat = {
	sound : 'meow!'
}

var dog = {
	sound : 'woof!'
}

var angryDog = {
	barking : function(){
		console.log(this.sound.toUpperCase());
	}
}

//Object.setPrototypeOf(cat, animal);
cat.prototype = animal.getPrototypeOf(animal);
Object.setPrototypeOf(dog, animal);
Object.setPrototypeOf(angryDog, dog);

cat.talk();
dog.talk();
angryDog.barking();
console.log(Object.getPrototypeOf(angryDog), angryDog.__proto__);

//--------------------------

//Change animal talk ...