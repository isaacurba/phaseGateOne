const prompt = require("prompt-sync")();

let num1 = Number(prompt("Enter number: "));
let num2 = Number(prompt("Enter number: "));

if (num1 > num2){
     console.log(`${num1} is the largest`);
}else{
     console.log(`${num2} is the largest`);
}
