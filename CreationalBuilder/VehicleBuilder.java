package CreationalBuilder;

public interface VehicleBuilder {
    VehicleBuilder brand(String brand);
    VehicleBuilder model(String model);
    VehicleBuilder color(String color);
    VehicleBuilder doors(int doors);
    VehicleBuilder topSpeed(int topSpeed);
    VehicleBuilder engine(String engine);
    VehicleBuilder height(int height);
}
