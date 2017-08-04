car = {
	name:'automobile', 
	wheels:4,
	getName: function(){return this.name}
}
honda = Object.create(car);
honda.name = "honda";
car.wheels = 10;
console.log(Object.getPrototypeOf(honda)); 
console.log(Object.getPrototypeOf(car));


// function Employee(name, dept){
// 	this.name = name || '';
// 	this.dept = dept || '';
// }
// function Manager(name, dept, reports){
// 	this.reports = reports || '';
// }

// Manager.prototype = new Employee();
// Manager.prototype.constructor = Manager;

// var man1 = new Manager('Manager1', 'Team1', 'Head1');
// var emp1 = new Employee('Employee1', 'Team1');

// console.log(man1);
// console.log(emp1);
