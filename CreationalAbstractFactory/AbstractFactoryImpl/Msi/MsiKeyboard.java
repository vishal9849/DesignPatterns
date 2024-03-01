package CreationalAbstractFactory.AbstractFactoryImpl.Msi;

import CreationalAbstractFactory.AbstractFactoryImpl.Keyboard;

public class MsiKeyboard implements Keyboard {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Keyboard");
    }
}
