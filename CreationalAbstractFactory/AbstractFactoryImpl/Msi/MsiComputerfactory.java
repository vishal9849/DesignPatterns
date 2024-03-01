package CreationalAbstractFactory.AbstractFactoryImpl.Msi;

import CreationalAbstractFactory.AbstractFactoryImpl.ComputerFactory;
import CreationalAbstractFactory.AbstractFactoryImpl.Gpu;
import CreationalAbstractFactory.AbstractFactoryImpl.Keyboard;
import CreationalAbstractFactory.AbstractFactoryImpl.Monitor;

public class MsiComputerfactory extends ComputerFactory {
    @Override
    protected Keyboard createKeyboard() {
        return new MsiKeyboard();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
