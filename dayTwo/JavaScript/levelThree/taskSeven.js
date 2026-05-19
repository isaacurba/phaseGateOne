const prompt = require("prompt-sync")();

let sum = 0;

for (let index = 1; index <= 5; index++){
    let number = Number(prompt("Enter number: "));
    sum+=number;
}

console.log(sum);
