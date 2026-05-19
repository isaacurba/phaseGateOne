const prompt = require("prompt-sync")();

let number = Number(prompt("Enter number to get the factorial: "));
let factorial = 1;

for (let index = 1; index <= number; index++){
    factorial *= index
}

console.log(factorial);
