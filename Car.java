public class Car extends Vehicle {
    private int doorCount;

    public Car(String name, double rentalPrice, int doorCount) {
        super(name, rentalPrice, "Car");
        this.doorCount = doorCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getName() + ", Price: " + getRentalPrice() + ", Doors: " + doorCount);
    }
}
