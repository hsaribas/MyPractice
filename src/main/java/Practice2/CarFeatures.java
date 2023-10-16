package Practice2;

public abstract class CarFeatures {

    String origin;
    String brand;
    String model;
    String horsePower;
    String doors;
    String transmission;
    String fuelType;

    public CarFeatures(String origin, String brand, String model, String horsePower, String doors, String transmission, String fuelType) {
        this.origin = origin;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.doors = doors;
        this.transmission = transmission;
        this.fuelType = fuelType;
    }

    public abstract void information();
}
