const prompt = require("prompt-sync")();

let number = Number(prompt("Enter number to print the sum to that number: "));
let sum = 0;

for (let index = 1; index <= number; index++){
    sum += index
}

console.log(sum);
