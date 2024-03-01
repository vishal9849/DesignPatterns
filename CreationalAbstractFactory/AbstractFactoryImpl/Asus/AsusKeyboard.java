package CreationalAbstractFactory.AbstractFactoryImpl.Asus;

import CreationalAbstractFactory.AbstractFactoryImpl.Keyboard;

public class AsusKeyboard implements Keyboard {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Keyboard");
    }
}
