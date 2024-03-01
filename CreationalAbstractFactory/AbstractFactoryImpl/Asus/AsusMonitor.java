package CreationalAbstractFactory.AbstractFactoryImpl.Asus;

import CreationalAbstractFactory.AbstractFactoryImpl.Monitor;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Monitor");
    }
}
