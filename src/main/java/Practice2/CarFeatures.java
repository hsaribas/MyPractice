package Practice2;

public abstract class CarFeatures {

    String origin;
    String brand;
    String model;
    String horsePower;
    String doors;
    String transmission;
    String fuelType;

    public CarFeatures(String origin, String brand, String model, String horsePower, String doors,
                       String transmission, String fuelType) {
        this.origin = origin;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.doors = doors;
        this.transmission = transmission;
        this.fuelType = fuelType;
    }

    public abstract void information();

    public void example() {
        System.out.println("This method doesn't has to be overridden by child class. " +
                "But we can override it if needed. " +
                "If we want to create a non abstract method, it should has method body. " +
                "Only an abstract method doesn't has method body.");
    }
}
