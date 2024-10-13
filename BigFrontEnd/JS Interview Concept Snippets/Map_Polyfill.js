// Polyfill for map
Array.prototype.myMap = function (cb) {
  let temp = [];
  for (let i = 0; i < this.length; i++) {
    temp.push(cb(this[i], i, this));
  }

  return temp;
};

const multiplyThree = nums.myMap((num, index, arr) => {
  return num * 3;
});

console.log(multiplyThree);