import random

random = random.randint(1, 2)

attempt = 1

print("Welcome to number guessing game.")
print()
print("You have 5 attempts.")
print()

while attempt <= 5:
    guess = int(input("Guess a number from 1 - 100: "))
    
    if guess == random:
        if attempt == 1: print("Legendary")
        elif attempt == 2: print("Excellent")
        elif attempt == 3 or attempt == 4: print("Good")
        elif attempt == 5: print("close")
        print()

        print(f"you used {attempt} attempts \nthe correct answer was {random} ") 
        break
        
    elif guess < random:
        print("Your guess is lower. TRY AGAIN")
        print()
        attempt+=1
    
    elif guess > random:
        if guess > 100:
            print("WARNING GUESS A NUMBER FROM 1 - 100")
            print()
        else: 
            print("Your guess is higher. TRY AGAIN")
            print()
            
            attempt+=1
            
    else: print("Better luck")
