package CreationalFactory.FactoryImpl;

public class MainApp {
    public static void main(String[] args) {
        Restaurant chickenBurger = new ChickenBurgerRestaurant();
        chickenBurger.orderBurger();

        System.out.println("----------------------------");

        Restaurant veggieBurger = new VeggieBurgerRestaurant();
        veggieBurger.orderBurger();
    }
}
