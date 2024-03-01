package CreationalFactory.FactoryImpl;

import CreationalFactory.AnotherImpl.Burger;
import CreationalFactory.AnotherImpl.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
