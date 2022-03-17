import java.util.ArrayList;

public class ParkingLot {


    private int totalSlots;
    private ArrayList<Car> parkedCars = new ArrayList<Car>();

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;

    }

    public void park(Car car) throws ParkingLotFullException, CarAlreadyParkedException {

        if (couldParkCar(car)) {
            parkedCars.add(car);
        }

    }

    private boolean couldParkCar(Car car) throws ParkingLotFullException, CarAlreadyParkedException {
        if (!isSlotAvailable()) {
            throw new ParkingLotFullException();
        } else if (isCarParkedAlready(car)) {
            throw new CarAlreadyParkedException();
        }
        return true;
    }


    public boolean isCarParkedAlready(Car car) {
        return parkedCars.contains(car);
    }

    private boolean isSlotAvailable() {
        return totalSlots - parkedCars.size() > 0;
    }

}
