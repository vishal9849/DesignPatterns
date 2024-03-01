package CreationalAbstractFactory.NormalFactoryImpl;

public class AsusManufacturer extends Company {
    @Override
    protected Gpu createGpu() {
        return new AsusGpu();
    }
}
