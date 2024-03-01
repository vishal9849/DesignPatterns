package CreationalAbstractFactory.NormalImpl;

public class MainApp {
    public static void main(String[] args) {
        Company asusManufacturer = new AsusManufacturer();
        asusManufacturer.createComponent("gpu");

        asusManufacturer.createComponent("monitor");

        System.out.println("----------------------");

        Company msiManufacturer = new MsiManufacturer();
        msiManufacturer.createComponent("monitor");
        msiManufacturer.createComponent("Gpu");

        // As the MsiManufacturer and AsusManufactur class is checking for
        // product type before creation, it is open for modification if our company adds a new product
        // so we have to use abstract factory pattern
    }
}
