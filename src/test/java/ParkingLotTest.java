import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    void shouldBeAbleToParkTheCar() throws ParkingLotFullException, CarAlreadyParkedException {

        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        parkingLot.park(car);

        assertTrue(parkingLot.isCarParkedAlready(car));

    }

    @Test
    void shouldNotBeAbleToParkTheCarIfCapacityIsZero() throws ParkingLotFullException, CarAlreadyParkedException {
        ParkingLot parkingLot = new ParkingLot(0);
        Car car = new Car();

        assertThrows(ParkingLotFullException.class, () -> parkingLot.park(car));

    }

    @Test
    void shouldNotBeAbleToParkTheSameCarMoreThanOnce() throws ParkingLotFullException, CarAlreadyParkedException {
        ParkingLot parkingLot = new ParkingLot(2);
        Car car = new Car();
        parkingLot.park(car);

        assertThrows(CarAlreadyParkedException.class, () -> parkingLot.park(car));

    }
}
