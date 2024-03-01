package CreationalAbstractFactory.AbstractFactoryImpl.Msi;

import CreationalAbstractFactory.AbstractFactoryImpl.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor");
    }
}
