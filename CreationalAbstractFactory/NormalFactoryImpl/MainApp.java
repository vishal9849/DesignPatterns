package CreationalAbstractFactory.NormalFactoryImpl;

public class MainApp {

    public static void main(String[] args) {
        Company asusManufacturer = new AsusManufacturer();
        asusManufacturer.assembleGpu();

        System.out.println("---------------");

        new MsiManufacturer().assembleGpu();

        // Consider the company is expanding and we have a new Product -- MONITOR
        // Check out NormalImpl and AbstractFactoryImpl packages further.
    }
}
