import java.util.Scanner;

public class TaskFive {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number in Celsius to convert to Fahrenheit: ");
        int celcius = input.nextInt();
        
        int fahrenheit = (celcius * 9 / 5) + 32;
        
        System.out.print(fahrenheit);
        
        
    
    }
}
