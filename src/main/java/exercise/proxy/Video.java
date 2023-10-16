package exercise.proxy;

public class Video {

    private String name;
    private Object data;

    public Video(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public Object getData() {
        return data;
    }
}
