package StructuralProxy.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
    }
    @Override
    public void connectTo(String host) {
        if (!bannedSites.contains(host)) {
            internet.connectTo(host);
        }else {
            System.out.println("Access denied to " + host);
            return;
        }

    }
}
