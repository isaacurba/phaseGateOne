import java.util.Scanner;

public class TaskEight {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to get the square: ");
        int number = input.nextInt();
   
        int square = number * number;
        
        System.out.print(square);
        
    
    }
}
