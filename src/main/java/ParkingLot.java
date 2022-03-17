import java.util.ArrayList;

public class ParkingLot {


    private int availableSlots;
    private int totalSlots;
    private ArrayList<Car> parkedCars = new ArrayList<Car>();

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots;
    }

    public boolean park(Car car) {

        if (isSlotAvailable() && isCarParkedAlready(car)) {

            availableSlots = availableSlots - 1;
            parkedCars.add(car);
            return true;
        }
        return false;

    }

    private boolean isCarParkedAlready(Car car) {
        return !parkedCars.contains(car);
    }

    private boolean isSlotAvailable() {
        return availableSlots > 0;
    }

}
