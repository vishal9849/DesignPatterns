package CreationalAbstractFactory.AbstractFactoryImpl.Msi;

import CreationalAbstractFactory.AbstractFactoryImpl.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Gpu");
    }
}
