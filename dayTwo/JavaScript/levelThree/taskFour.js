const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number to get the multiplication table: "))

for (let index = 1; index <= 12; index++){
    console.log(`${number} x ${index} = ${index * number}`);

}
