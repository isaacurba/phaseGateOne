import java.util.Scanner;
import java.util.Arrays;

public class ParkingLot {

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        System.out.print(park(number));
        
        System.out.print(slot());
        
        
    }
        
    public static int[] space = new int[20];
        
    public static String park(int number){
        
        String message = "slot is taken";
        if (space[number - 1] == 0){
            space[number - 1] = 1;
            
            message = "car added successfully";
        }
        return message;
    }
    
    public static String remove(int number){
        String message = "slot is free";
        if (space[number - 1] == 1){
            space[number - 1] = 0;
            
            message = "car removed successfully";
        }
        return message;
    }
    
    public static String slot(){
        return Arrays.toString(space);
    }
    
}
