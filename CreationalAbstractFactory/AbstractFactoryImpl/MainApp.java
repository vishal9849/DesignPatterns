package CreationalAbstractFactory.AbstractFactoryImpl;


import CreationalAbstractFactory.AbstractFactoryImpl.Asus.AsusComputerfactory;
import CreationalAbstractFactory.AbstractFactoryImpl.Msi.MsiComputerfactory;

public class MainApp {

    public static void main(String[] args) {
        ComputerFactory asus = new AsusComputerfactory();
        asus.orderMonitor();
        asus.orderGpu();
        // Adding third product to our company -- Keyboard;
        asus.orderKeyboard();

        System.out.println("-------------------------");

        ComputerFactory msi = new MsiComputerfactory();
        msi.orderGpu();
        msi.orderMonitor();
        msi.orderKeyboard();
    }
}
