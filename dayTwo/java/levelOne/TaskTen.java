import java.util.Scanner;

public class TaskTen {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
   
        double average = (num1 + num2 + num2) / 3;
        
        System.out.print(average);
        
    
    }
}
