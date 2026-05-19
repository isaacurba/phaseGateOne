import java.util.Scanner;

public class TaskSeven {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        int radius = input.nextInt();
        double pi = 3.142857143;
        double circumference = 2 * pi * radius;
        
        System.out.print(circumference);
        
        
    
    }
}
