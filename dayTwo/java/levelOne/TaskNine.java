import java.util.Scanner;

public class TaskNine {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter price for an item: ");
        int number = input.nextInt();
   
        double tax = number * 10 / 100;
        double total = tax + number;
        
        System.out.print(total);
        
    
    }
}
