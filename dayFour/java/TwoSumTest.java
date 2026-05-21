import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    public void testToCheckSumOfTwoNumbersInTheArrayGetsTheTarget(){

        int[] arr = {8, 6, 12, 4, -2};
        int target = 6;
        int[] expected = {8, -2};
        int[] actual = TwoSum.targettingSum(arr, target);
        assertArrayEquals(expected, actual);        
    }

    @Test
    public void testToCheckTheSumOfAnotherNumberToSeeTheSum(){

        int[] arr = {1, 2, 5, 7, 6, 8, 9};
        int target = 12;
        int[] expected = {5, 7};
        int[] actual = TwoSum.targettingSum(arr, target);
        assertArrayEquals(expected, actual);        
    }
    

}
