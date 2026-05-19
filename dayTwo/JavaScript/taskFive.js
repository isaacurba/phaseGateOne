const prompt = require("prompt-sync")();

let num1 = Number(prompt("Enter number: "));
let num2 = Number(prompt("Enter number: "));
let num3 = Number(prompt("Enter number: "));

largest = num1;

if (num2 > largest){
     console.log(`${num2} is the largest`);
}else if (num3 > largest){
     console.log(`${num3} is the largest`);
}else {
    console.log(`{largest} is the largest`);
}
