// callback function example

function log(value) {
  console.log(value);
}

function findSum(num1, num2, print) {
  const sum = num1 + num2;

  print(sum);
}

findSum(20, 30, log);