const prompt = require("prompt-sync")();

let score = Number(prompt("Enter number: "));

if (score >= 50){
     console.log(`pass`);
}else{
     console.log(`fail`);
}
