package CreationalFactory.AnotherImpl;


public class MainApp {
    public static void main(String[] args) {
        String userRequest = "Chicken Burger";
        Burger burger = getOrder(userRequest);
        burger.prepare();
    }

    // Tough we are able to determine the burger the below method returns
    // Still its open for modification as long as we add additional products
    public static Burger getOrder( String userRequest) {
        if (userRequest.equalsIgnoreCase("chicken")) {
            return new ChickenBurger();
        } else if (userRequest.contains("veggie")) {
            return new VeggieBurger();
        }
        // else if( userRequest.contains("Sweet)){
        //  return new SweetBurger();
        //{
            return new VeggieBurger();
    }
}
