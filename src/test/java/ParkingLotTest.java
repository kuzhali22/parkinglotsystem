import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    void shouldBeAbleToParkTheCar() {

        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car(false);

        boolean parkingStatus = parkingLot.park(car);

        assertTrue(parkingStatus);

    }

    @Test
    void shouldNotBeAbleToParkTheCarIfCapacityIsZero() {
        ParkingLot parkingLot = new ParkingLot();
        Car car1 = new Car(false);
        Car car2 = new Car(false);

        boolean parkingStatus1 = parkingLot.park(car1);
        boolean parkingStatus2 = parkingLot.park(car2);

        assertFalse(parkingStatus2);

    }

    @Test
    void shouldNotBeAbleToParkTheSameCarMoreThanOnce() {
        ParkingLot parkingLot = new ParkingLot();
        Car car1 = new Car(true);

        boolean parkingStatus = parkingLot.park(car1);

        assertFalse(parkingStatus);

    }
}
