public class ParkingLot {


    private final int totalSlot = 1;
    private int availableSlots = totalSlot;

    public ParkingLot() {

    }

    public boolean park(Car car) {

        if (availableSlots > 0 && !car.isParked) {
            availableSlots = availableSlots - 1;
            car.isParked = true;
            return true;
        }
        return false;
    }
}
