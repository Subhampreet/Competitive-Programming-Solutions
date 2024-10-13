Array.prototype.myReduce = function (cb, initialValue) {
  let acc = initialValue;

  for (let i = 0; i < this.length; i++) {
    acc = acc ? cb(acc, this[i], i, this) : this[i];
  }

  return acc;
};

const sum = nums.myReduce((acc, curr, i, arr) => {
  return acc + curr;
}, 0);

console.log(sum);