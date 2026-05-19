const prompt = require("prompt-sync")();

let number = Number(prompt("Enter number: "));

if (number > 0){
     console.log(`${number} is a positive number`);
}else{
     console.log(`${number} is a anegative number`);
}
