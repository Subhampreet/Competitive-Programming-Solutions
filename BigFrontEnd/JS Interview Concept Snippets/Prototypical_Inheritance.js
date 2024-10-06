// Prototypical Inheritance
let animal = {
  eats: true,
  walk() {
    console.log("Animal can walk");
  },
};

let herbivore = {
  eats: true,
  grass() {
    console.log("Animal eats veg");
  },
};

// let rabbit = {
//   jumps: true,
// };

// rabbit.__proto__ = animal; // Old Way
let rabbit = Object.create(animal);

console.log(rabbit.eats);
console.log(rabbit.walk());
console.log(Object.getPrototypeOf(rabbit));
Object.setPrototypeOf(rabbit, herbivore);
console.log(Object.getPrototypeOf(rabbit));