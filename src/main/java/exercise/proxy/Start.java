package exercise.proxy;

import design_pattern.structural.proxy.ProxyClass_ProxInternet;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        VideoProxy proxy = new VideoProxy(new RealVideoDownloader());
        List<Video> videoList =
                List.of(
                    new Video("first", null),
                    new Video("second", null),
                    new Video("first", null),
                    new Video("first", null)
                );
        for (Video video : videoList){
            proxy.getVideo(video.getName());
        }

    }
}
