import java.util.*;
import java.io.*;

public class RentalTransaction {
    private ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

    public void rentVehicle(Vehicle v) throws Exception {
        if (!v.isAvailable()) {
            throw new Exception("Vehicle is not available!");
        }
        rentedVehicles.add(v);
        v.setAvailable(false);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Vehicle v : rentedVehicles) {
            total += v.getRentalPrice();
        }
        return total;
    }

    public void printReceipt(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("===== RENTAL RECEIPT =====\n");
        for (Vehicle v : rentedVehicles) {
            writer.write(v.getName() + " - " + v.getType() + " - " + v.getRentalPrice() + "\n");
        }
        writer.write("Total: IDR" + calculateTotalPrice() + "\n");
        writer.close();
    }
}
