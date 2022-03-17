import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    void shouldBeAbleToParkTheCar() {

        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        boolean parkingStatus = parkingLot.park(car);

        assertTrue(parkingStatus);

    }

    @Test
    void shouldNotBeAbleToParkTheCarIfCapacityIsZero() {
        ParkingLot parkingLot = new ParkingLot(0);
        Car car = new Car();

        boolean parkingStatus = parkingLot.park(car);

        assertFalse(parkingStatus);

    }

    @Test
    void shouldNotBeAbleToParkTheSameCarMoreThanOnce() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        parkingLot.park(car);
        boolean parkingStatus = parkingLot.park(car);

        assertFalse(parkingStatus);

    }
}
