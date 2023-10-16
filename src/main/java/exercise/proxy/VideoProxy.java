package exercise.proxy;

import java.util.Hashtable;

public class VideoProxy implements VideoDownloader{

    Hashtable<String, Video> videoCache;
    private VideoDownloader downloader;

    public VideoProxy(VideoDownloader videoDownloader){
        videoCache = new Hashtable<>();
        this.downloader = videoDownloader;
    }

    @Override
    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)){
            videoCache.put(videoName, downloader.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
