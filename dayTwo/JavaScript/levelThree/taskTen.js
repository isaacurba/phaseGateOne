const prompt = require("prompt-sync")();

let number = Number(prompt("Enter number to count how many digit: "))
let count = 0;
while(number > 0){
    number /= 10;
    count++; 
}

console.log(count)
