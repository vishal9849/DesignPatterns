package CreationalBuilder;


public class CarBuilder implements VehicleBuilder {

    private String brand;
    private String model;
    private String color;
    private int doors;
    private int topSpeed;
    private String engine;
    private int height;

    @Override
    public CarBuilder brand(String brand) {
        this.brand=brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder doors(int doors) {
        this.doors = doors;
        return  this;
    }

    @Override
    public CarBuilder topSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    @Override
    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    public Car build(){
        return new Car(brand,  model,  color,  doors,  topSpeed,  engine, height);
    }
}
