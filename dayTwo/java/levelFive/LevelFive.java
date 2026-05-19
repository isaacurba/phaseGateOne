import java.util.Arrays;
public class LevelFive {
    
    public static void main(String... args){
        
        int[] arr = {5, -9, 3, -6, 2, -11};
        
        int[] newArr = {5, 0, 3, 0, 2, 0}; 
        
        System.out.println(Arrays.toString(replaceNegative(arr)));
        
        System.out.println(Arrays.toString(moveZero(newArr)));
    }


    public static int[] replaceNegative(int[] arr){
    
        int[] removeNegative = new int[arr.length];
        
        for(int index = 0; index < arr.length; index++){
            removeNegative[index] = arr[index];
            if (removeNegative[index] < 0){
                removeNegative[index] = 0;
            }
        }
        return removeNegative;
    }
    
    
    public static int[] moveZero(int[] arr){
        int[] movedZero = new int[arr.length];
        int reverse = arr.length - 1;
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == 0){
                if (arr[index] != 0)
                movedZero[reverse--] = arr[index];
            }
        }
        return movedZero;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
