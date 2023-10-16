package exercise.proxy;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to youtube");
        System.out.println("Downloading Video " + videoName);
        return new Video(videoName, null);
    }
}
