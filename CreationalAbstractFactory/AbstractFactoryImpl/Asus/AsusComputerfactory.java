package CreationalAbstractFactory.AbstractFactoryImpl.Asus;

import CreationalAbstractFactory.AbstractFactoryImpl.ComputerFactory;
import CreationalAbstractFactory.AbstractFactoryImpl.Gpu;
import CreationalAbstractFactory.AbstractFactoryImpl.Keyboard;
import CreationalAbstractFactory.AbstractFactoryImpl.Monitor;

public class AsusComputerfactory extends ComputerFactory {
    @Override
    protected Keyboard createKeyboard() {
        return new AsusKeyboard();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
