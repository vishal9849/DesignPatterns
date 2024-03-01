package CreationalBuilder;

public class Car {
    public Car(String brand, String model, String color, int doors, int topSpeed, String engine, int height) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.topSpeed = topSpeed;
        this.engine = engine;
        this.height = height;
    }

    private final String brand;
    private final String model;
    private final String color;
    private final int doors;
    private final int topSpeed;
    private final String engine;
    private final int height;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", topSpeed=" + topSpeed +
                ", engine='" + engine + '\'' +
                ", height=" + height +
                '}';
    }
}
