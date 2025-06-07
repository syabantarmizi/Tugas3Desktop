public class Bus extends Vehicle {
    private int capacity;

    public Bus(String name, double rentalPrice, int capacity) {
        super(name, rentalPrice, "Bus");
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bus: " + getName() + ", Price: " + getRentalPrice() + ", Capacity: " + capacity);
    }
}
