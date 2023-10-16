package design_pattern.behavioural.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NewsLetter implements Subject{

    List<Observer> subscribers;
    private boolean updated;
    private String message;

    public boolean isUpdated() {
        return updated;
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("User doesn't exist");
        if(subscribers == null){
            subscribers = new LinkedList<>();
        }
        if (!subscribers.contains(obj)){
            subscribers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        subscribers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        if (this.isUpdated()){
            for (Observer subscriber: subscribers){
                subscriber.update();
            }
            this.updated = false;
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void createPost(String message){
        System.out.println("Created new message " + message);
        this.message = message;
        this.updated = true;
        notifyObservers();
    }
}
