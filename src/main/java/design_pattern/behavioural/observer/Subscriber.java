package design_pattern.behavioural.observer;

public class Subscriber implements Observer{

    private String name;
    private Subject channel;

    public Subscriber(String name){
        this.name = name;
    }


    @Override
    public void update() {
        String message = (String) this.channel.getUpdate(this);
        if (message == null){
            System.out.println(this.name + " no new message");
        }else{
            System.out.println(this.name + " Consuming message " + message);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.channel = sub;
    }
}
