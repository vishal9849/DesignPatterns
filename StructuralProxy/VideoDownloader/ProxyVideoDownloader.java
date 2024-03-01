package StructuralProxy.VideoDownloader;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {

    private final Map<String, video> videoCache = new HashMap<>();
    private final VideoDownloader videoDownloader = new RealVideoDownloader();
    @Override
    public video download(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            video downloadedVideo = videoDownloader.download(videoName);
            videoCache.put(videoName, downloadedVideo);
            return downloadedVideo;
        }else {
            System.out.println("Downloading from VideoCache ---------");
            video cachedVideo = videoCache.get(videoName);
            System.out.println(cachedVideo);
            return cachedVideo;
        }
    }
}
