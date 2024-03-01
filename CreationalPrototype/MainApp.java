package CreationalPrototype;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Car lambo = new Car("lambo","aventador","red",300);
        Bus bus = new Bus ("bus_brand","bus_model","blue",8);

        ArrayList<Vehicle> vehiclList = new ArrayList<>();
        vehiclList.addAll(List.of(lambo, bus));

        System.out.println("Original vehicles objects");
        vehiclList.forEach(System.out::println);

        List<Vehicle> copyList = new ArrayList<>();

        // The clone methods determines the return type of object.
        // As Car and Bus are sub classes of Vehicle they can be stored on one array list
        vehiclList.forEach(v -> {
            copyList.add(v.clone());
        });

        // If there was no clone method we would need to check for the conditions.

//        for (Vehicle vehicle : vehiclList) {
//            if (vehicle instanceof Car) {
//                // add copy of car object to List
//            } else if (vehicle instanceof Bus) {
//                // add copy of bus object to list
//            }
//        }


        System.out.println("Cloned vechile objects ------");
        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        VehicleCache vehicleCache = new VehicleCache();
        vehicleCache.put(vehiclList);

        System.out.println(vehicleCache.get("bus_brand bus_model"));

//        -------------
        Car moddedLambo = new Car(lambo.getBrand(), lambo.getModel(), lambo.getColor(),400);
        moddedLambo.clone();

    }
}
