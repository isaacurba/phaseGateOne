import java.util.Arrays;

public class SecondTask {
    
    public static int[] removeDuplicate(int[] arr){
        
        int count = 0;
        int[] result = new int[arr.length];
        
        for (int index = 0; index < arr.length; index++){  
            boolean isDuplicate = false;
            
            for (int secondIndex = 0; secondIndex < index; secondIndex++){
                
                if(arr[index] == arr[secondIndex]){
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate){
                result[count] = arr[index];
                count++;
            }
        }
        
        return Arrays.copyOf(result, count);
    }
    
    
    
    
    public static int[] ascendingArray(int[] arr){
        
        int largest = arr[0];
        int smallest = arr[0];
        int count = 0;
        int[] result = new int[count];
        
        for (int index = 0; index < arr.length; index++){
            
            int secondIndex;
            for (secondIndex = 1; secondIndex < arr.length; secondIndex++){
                
                if (arr[index] > largest){
                    largest = arr[index];   
                }
            }
            
            
            for (int thirdIndex = 0; thirdIndex < arr.length; thirdIndex++){
                if (arr[thirdIndex] < smallest){
                    smallest = arr[thirdIndex];
                }    
            }

        }
        
        for (int index = smallest; index <= largest; index++){
            
            result[count] = index;
            count++;
        }
        
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
