public class ParkingLot {


    private final int parkingSlot;

    public ParkingLot(int parkingSlot) {

        this.parkingSlot = parkingSlot;
    }

    public boolean checkParkingSuccessful() {

        if(parkingSlot > 0)
            return true;
        return false;
    }
}
