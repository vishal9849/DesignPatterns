package CreationalAbstractFactory.AbstractFactoryImpl.Asus;

import CreationalAbstractFactory.AbstractFactoryImpl.Gpu;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Gpu");
    }
}
