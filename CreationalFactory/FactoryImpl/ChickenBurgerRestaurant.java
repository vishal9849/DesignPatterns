package CreationalFactory.FactoryImpl;

import CreationalFactory.AnotherImpl.Burger;
import CreationalFactory.AnotherImpl.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
