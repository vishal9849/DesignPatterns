package CreationalBuilder;

import CreationalBuilder.Director.Director;

public class MainApp {
    public static void main(String[] args) {
        CarBuilder car = new CarBuilder()
                .height(115)
                .brand("Bugatti")
                .color("Black")
                .engine("W16")
                .topSpeed(400)
                .doors(2)
                .model("chiron");
        Car bugatti = car.build();
        System.out.println(bugatti);

        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.buildBugatti(builder);

        Car divo = builder.model("Divo").topSpeed(420).build();
        System.out.println(divo);
    }
}
