package CreationalAbstractFactory.NormalFactoryImpl;

public class MsiManufacturer extends Company {
    @Override
    protected Gpu createGpu() {
        return new MsiGpu();
    }
}
