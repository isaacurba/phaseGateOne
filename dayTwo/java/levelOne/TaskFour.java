import java.util.Scanner;

public class TaskFour {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1  = input.nextInt();
        
        System.out.print("Enter first number: ");
        int num2  = input.nextInt();
        
        int product = num1 * num2;
        
        
        System.out.print("The product of " + num1 + " and " + num2 + " is " + product);
        
        
    
    }
}
