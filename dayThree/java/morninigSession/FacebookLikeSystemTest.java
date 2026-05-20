import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikeSystemTest {
    @Test
    public void testToCheckIfArrayIsEmptytoReturnNoOneLikesThis(){
        String[] arr = {null};
        String expected = "no one likes this";
        String actual = FacebookLikeSystem.countLikes(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToCheckIfThereIsOneNameInTheArray(){
        String[] arr = {"peter"};
        String expected = "peter likes this";
        String actual = FacebookLikeSystem.countLikes(arr);
        assertEquals(expected, actual);   
    }
    
    @Test
    public void testToCheckIfOnlyTwoPeopleNameInTheArray(){
        String[] arr = {"peter", "alex"};
        String expected = "peter and alex likes this";
        String actual = FacebookLikeSystem.countLikes(arr);
        assertEquals(expected, actual);   
    }
    
    @Test
    public void testToCheckIfTheLengthOfTheArrayIsThree(){
        String[] arr = {"peter", "alex", "mark"};
        String expected = "peter, alex and mark likes this";
        String actual = FacebookLikeSystem.countLikes(arr);
        assertEquals(expected, actual);   
    }
    
    @Test
    public void testToCheckIfTheLengthOfArrayIsMoreThanThree(){
        String[] arr = {"peter", "alex", "mark", "max", "john", "ricky"};
        String expected = "peter, alex and 6 others likes this";
        String actual = FacebookLikeSystem.countLikes(arr);
        assertEquals(expected, actual);   
    }
    
}
