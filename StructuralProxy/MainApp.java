package StructuralProxy;

import StructuralProxy.Internet.Internet;
import StructuralProxy.Internet.ProxyInternet;
import StructuralProxy.VideoDownloader.ProxyVideoDownloader;
import StructuralProxy.VideoDownloader.VideoDownloader;

public class MainApp {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("----------------------------");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.download("JavaVideo");
        videoDownloader.download("FunnyVideo");
        videoDownloader.download("JavaVideo");

    }
}
