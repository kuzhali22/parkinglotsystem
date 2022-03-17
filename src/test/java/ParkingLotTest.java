import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    void shouldFindParkingSuccessful() {

        ParkingLot parkingLot = new ParkingLot(1);

        boolean isSuccessful = parkingLot.checkParkingSuccessful();

        Assertions.assertTrue(isSuccessful);

    }
}
