import java.util.Scanner;

public class NumberGuessingApp {
    public static void main(String... args){
    
        Scanner input = new Scanner(System.in);
        
        double random = Math.floor(Math.random() * 100) + 1;
        int attempt = 1;
        
        System.out.println("Welcome to number guessing game.");
        System.out.println("You have 5 attempts.");
        
        while (attempt <= 5){
            System.out.print("Guess a number between 1 - 100: ");
            int guess = input.nextInt();
            
            if (guess == random){
                if (attempt == 1) System.out.print("Legendary");
                else if (attempt == 2) System.out.print("Excellent");
                else if (attempt == 3 || attempt == 4) System.out.print("Good");
                else if (attempt == 5) System.out.print("close");
                System.out.println();
                
                System.out.printf("you used %d attempts \nthe correct answer was %d ", attempt, random);
                break;
            }
            else if (guess < random){
                System.out.println("Your guess is lower. TRY AGAIN");
                System.out.println();
                attempt++;
            }
            else if (guess > random){
                if (guess > 100){
                    System.out.println("Final warning please enter a number from 1 - 100");
                    System.out.println();
                }else{
                    System.out.println("Your guess is higher. TRY AGAIN");
                    System.out.println();
                    attempt++;
                }
                
            }
            
            
        }
    }
}
