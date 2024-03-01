package CreationalFactory.NormalImpl;

import CreationalFactory.ChickenBurger;
import CreationalFactory.VeggieBurger;

public class MainApp {
    public static void main(String[] args) {
        String userRequest = "Chicken Burger";
//        ??? burger = getOrder(userRequest);
        // There is ambiguity and the below method does not know which burger to return
         getOrder(userRequest);
    }

    // The below code if open for modification if we add a new kind of burger.
    public static ChickenBurger getOrder(String userRequest){
        if (userRequest.equalsIgnoreCase("chicken")) {
            return new ChickenBurger();
        } else if (userRequest.contains("veggie")){
//            return new VeggieBurger();
        }
        return null;
    }
}
