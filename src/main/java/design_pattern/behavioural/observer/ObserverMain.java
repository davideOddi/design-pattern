package design_pattern.behavioural.observer;

import java.util.List;

public class ObserverMain {

    public static void main(String[] args) {
       NewsLetter myNewsLetter = new NewsLetter();

       List<Subscriber> subscribers = List.of(
               new Subscriber("Davide"),
               new Subscriber("user2"),
               new Subscriber("user3"),
               new Subscriber("user4")
       );

       for (Subscriber sub : subscribers){
           myNewsLetter.register(sub);
           sub.setSubject(myNewsLetter);
       }

       subscribers.get(0).update();

       myNewsLetter.createPost("My new post");






    }

}
