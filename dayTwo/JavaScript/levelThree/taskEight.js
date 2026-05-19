const prompt = require("prompt-sync")();

let number = 1
let total = 0

while(number != 0){
    number = Number(prompt("Enter number (enter 0 to end the loop and get the sum): "))
    total += number
}
    
console.log(total)
