const prompt = require("prompt-sync")();

random = Math.floor(Math.random() * 100) + 1;
attempt = 1;

console.log("Welcome to number guessing game.");
console.log("You have 5 attempts.");

while (attempt <= 5){
    process.stdout.write("Guess a number between 1 - 100: ");
    guess = prompt();
    
    if (guess == random){
        if (attempt == 1) console.log("Legendary");
        else if (attempt == 2) console.log("Excellent");
        else if (attempt == 3 || attempt == 4) console.log("Good");
        else if (attempt == 5) console.log("close");
        console.log();
        
        console.logf("you used %d attempts \nthe correct answer was %d ", attempt, random);
        break;
    }
    else if (guess < random){
        console.log("Your guess is lower. TRY AGAIN");
        console.log();
        attempt++;
    }
    else if (guess > random){
        if (guess > 100){
            console.log("Final warning please enter a number from 1 - 100");
            console.log();
        }else{
            console.log("Your guess is higher. TRY AGAIN");
            console.log();
            attempt++;
        }
        
    }    
}

