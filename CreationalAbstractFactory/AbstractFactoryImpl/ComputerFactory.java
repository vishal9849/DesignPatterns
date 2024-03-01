package CreationalAbstractFactory.AbstractFactoryImpl;

public abstract class ComputerFactory {

    public void orderGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
    }
    public void orderMonitor() {
        Monitor monitor = createMonitor();
        monitor.assemble();
    }
    public void orderKeyboard() {
        Keyboard keyboard = createKeyboard();
        keyboard.assemble();
    }

    protected abstract Keyboard createKeyboard();

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();

}
