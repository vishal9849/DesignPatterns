package CreationalAbstractFactory.NormalFactoryImpl;

public abstract class Company {

    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    protected abstract Gpu createGpu();
}
