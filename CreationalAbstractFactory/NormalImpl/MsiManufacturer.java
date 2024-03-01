package CreationalAbstractFactory.NormalImpl;

public class MsiManufacturer extends Company {
    @Override
    public Component createComponent(String type) {
        Component component = null;
        if ("Gpu".equalsIgnoreCase(type)) {
            component = new MsiGpu();
            component.assemble();
        }else {
            component = new MsiMonitor();
            component.assemble();
        }
        return component;
    }
}
