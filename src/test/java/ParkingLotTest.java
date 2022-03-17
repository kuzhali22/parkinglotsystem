import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    void shouldBeAbleToParkTheCar() throws ParkingLotFullException, VehicleAlreadyParkedException {

        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        parkingLot.park(car);

        assertTrue(parkingLot.isVehicleParkedAlready(car));

    }

    @Test
    void shouldNotBeAbleToParkTheCarIfCapacityIsZero() throws ParkingLotFullException, VehicleAlreadyParkedException {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        Car denyCar = new Car();
        parkingLot.park(car);

        assertThrows(ParkingLotFullException.class, () -> parkingLot.park(denyCar));

    }

    @Test
    void shouldNotBeAbleToParkTheSameCarMoreThanOnce() throws ParkingLotFullException, VehicleAlreadyParkedException {
        ParkingLot parkingLot = new ParkingLot(2);
        Car car = new Car();
        parkingLot.park(car);

        assertThrows(VehicleAlreadyParkedException.class, () -> parkingLot.park(car));

    }

}
