package CreationalFactory.AnotherImpl;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}
