package CreationalBuilder.Director;

import CreationalBuilder.VehicleBuilder;

public class Director {

    public void buildBugatti(VehicleBuilder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .doors(2)
                .engine("8L")
                .height(115);
    }
    public void buildLambo(VehicleBuilder builder) {
        builder.brand("Lambo")
                .color("Grey")
                .doors(2)
                .engine("6.2")
                .height(110);
    }

}
