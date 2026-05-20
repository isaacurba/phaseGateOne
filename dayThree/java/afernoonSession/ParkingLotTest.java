import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
        
    @Test
    public void tesToAddCarWhenParkingLotIsEmptxy(){
        int number =  5;
        String expected = ParkingLot.park(number);
        assertEquals(expected, "car added successfully");
    }
    
    @Test
    public void tesToRemoveCarWhenParkingLotIsOccupied(){
        int number =  5;
        String expected = ParkingLot.remove(number);
        assertEquals(expected, "car removed successfully");
    }
    
    
}
