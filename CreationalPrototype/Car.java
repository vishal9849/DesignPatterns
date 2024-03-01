package CreationalPrototype;

public class Car extends Vehicle {

    public final int topSpeed;
    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    protected Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }


    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
