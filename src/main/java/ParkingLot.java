import java.util.ArrayList;

public class ParkingLot {

    private final int totalSlots;
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;

    }

    public void park(Vehicle vehicle) throws ParkingLotFullException, VehicleAlreadyParkedException {
        if (couldParkVehicle(vehicle)) {
            vehicles.add(vehicle);
        }
    }

    private boolean couldParkVehicle(Vehicle vehicle) throws ParkingLotFullException, VehicleAlreadyParkedException {
        if (isVehicleParkedAlready(vehicle)) {
            throw new VehicleAlreadyParkedException();
        } else if (!isSlotAvailable()) {
            throw new ParkingLotFullException();
        }
        return true;
    }


    public boolean isVehicleParkedAlready(Vehicle vehicle) {
        return vehicles.contains(vehicle);
    }

    private boolean isSlotAvailable() {
        return totalSlots > vehicles.size() ;
    }

}
