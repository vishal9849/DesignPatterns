package StructuralProxy.VideoDownloader;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public video download(String video) {
        System.out.println("Connecting to youtube");
        System.out.println("Searching for " + video);
        System.out.println("Downloading "+ video +" video");
        return new video(video);
    }
}
