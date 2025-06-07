import java.util.*;
import java.io.*;

public class VehicleRental {
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicleList.add(v);
    }

    public ArrayList<Vehicle> getAvailableVehicles() {
        ArrayList<Vehicle> available = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            if (v.isAvailable()) {
                available.add(v);
            }
        }
        return available;
    }

    public Vehicle findVehicleByName(String name) {
        for (Vehicle v : vehicleList) {
            if (v.getName().equalsIgnoreCase(name)) {
                return v;
            }
        }
        return null;
    }

    public void saveToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Vehicle v : vehicleList) {
            writer.write(v.getType() + ";" + v.getName() + ";" + v.getRentalPrice() + ";" + v.isAvailable() + "\n");
        }
        writer.close();
    }

    public void displayAllVehicles() {
        for (Vehicle v : vehicleList) {
            v.displayInfo();
        }
    }
}
