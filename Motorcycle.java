public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String name, double rentalPrice, int engineCapacity) {
        super(name, rentalPrice, "Motorcycle");
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + getName() + ", Price: " + getRentalPrice() + ", CC: " + engineCapacity);
    }
}
