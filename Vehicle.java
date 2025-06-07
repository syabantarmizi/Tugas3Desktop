public abstract class Vehicle {
    private String name;
    private double rentalPrice;
    private String type;
    private boolean isAvailable;

    public Vehicle(String name, double rentalPrice, String type) {
        this.name = name;
        this.rentalPrice = rentalPrice;
        this.type = type;
        this.isAvailable = true;
    }

    public abstract void displayInfo();


    public String getName() { return name; }
    public double getRentalPrice() { return rentalPrice; }
    public String getType() { return type; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}
