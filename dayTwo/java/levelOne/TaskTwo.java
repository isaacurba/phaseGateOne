import java.util.Scanner;

public class TaskTwo {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        int inFiveYears = age + 5;
        
        System.out.print("You will be " + inFiveYears + " years old in 5 years");
    
    }
}
