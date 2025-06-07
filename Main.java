import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRental rentalService = new VehicleRental();
        RentalTransaction transaction = new RentalTransaction();
        int choice;

        do {
            System.out.println("\n=== VEHICLE RENTAL MENU ===");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Available Vehicles");
            System.out.println("3. Rent Vehicle");
            System.out.println("4. Print Receipt");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter type (Car/Motorcycle/Bus): ");
                        String type = sc.nextLine();
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter rental price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        if (type.equalsIgnoreCase("Car")) {
                            System.out.print("Enter number of doors: ");
                            int doors = sc.nextInt();
                            rentalService.addVehicle(new Car(name, price, doors));
                        } else if (type.equalsIgnoreCase("Motorcycle")) {
                            System.out.print("Enter engine capacity (cc): ");
                            int cc = sc.nextInt();
                            rentalService.addVehicle(new Motorcycle(name, price, cc));
                        } else if (type.equalsIgnoreCase("Bus")) {
                            System.out.print("Enter passenger capacity: ");
                            int capacity = sc.nextInt();
                            rentalService.addVehicle(new Bus(name, price, capacity));
                        } else {
                            System.out.println("Unknown vehicle type!");
                        }
                        break;
                    case 2:
                        System.out.println("== Available Vehicles ==");
                        for (Vehicle v : rentalService.getAvailableVehicles()) {
                            v.displayInfo();
                        }
                        break;
                    case 3:
                        System.out.print("Enter vehicle name to rent: ");
                        String vehicleName = sc.nextLine();
                        Vehicle v = rentalService.findVehicleByName(vehicleName);
                        if (v != null) {
                            transaction.rentVehicle(v);
                            System.out.println("Vehicle successfully rented!");
                        } else {
                            System.out.println("Vehicle not found.");
                        }
                        break;
                    case 4:
                        transaction.printReceipt("receipt.txt");
                        System.out.println("Receipt has been saved to receipt.txt");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 5);
    }
}
