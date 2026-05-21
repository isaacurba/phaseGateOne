public class TwoSum {

    public static int[] targettingSum(int[] arr, int target) {
        
        int[] result = new int[2];
        
        for (int index = 0; index < arr.length; index++) {
            
            for (int secondIndex = index + 1; secondIndex < arr.length; secondIndex++) {
              
                if (arr[index] + arr[secondIndex] == target) {
                    result[0] = arr[index];
                    result[1] = arr[secondIndex];
                }
            }
        }
        return result;
    }

}
