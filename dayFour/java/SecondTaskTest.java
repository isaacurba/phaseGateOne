import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {
    @Test
    public void testToRemoveDuplicatFromTheArray(){

        int[] arr = {9, 5, 1, 9, 4, 5, 1, 7};
        int[] expected = {9, 5, 1, 4, 7};
        int[] actual = SecondTask.removeDuplicate(arr);
        assertArrayEquals(expected, actual);        
    }

//    @Test
//    public void testToSortTheArrayInAscendingOrderFromTheSmallest_The_Largest(){
//
//        int[] arr = {14, 9, 6, 5, 8, 10};
//        int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        int[] actual = SecondTask.ascendingArray(arr);
//        assertArrayEquals(expected, actual);        
//    }
    
//    @Test
//    public void testToSortTheArrayInAscendingOrder(){
//
//        int[] arr = {"pie", "fly", "bat"};
//        int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        int[] actual = TwoSum.targettingSum(arr, target);
//        assertArrayEquals(expected, actual);        
//    }
    

}
