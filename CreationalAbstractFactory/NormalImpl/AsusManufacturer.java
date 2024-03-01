package CreationalAbstractFactory.NormalImpl;

public class AsusManufacturer extends Company {
    @Override
    public Component createComponent(String type) {
        Component component = null;
        if ("gpu".equalsIgnoreCase(type)) {
            component = new AsusGpu();
            component.assemble();
        }else {
            component = new AsusMonitor();
            component.assemble();
        }
        return component;
    }
}
