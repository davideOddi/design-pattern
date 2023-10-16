package design_pattern.creational.singleton;

public class Singleton_main {

    public static void main(String[] args) {
        Singleton myInstance = Singleton.getInstance("ciao", 79);

        System.out.println(myInstance.getFieldString());
        Singleton myInstance2 = Singleton.getInstance("bye", 79);
        System.out.println(myInstance2.getFieldString());

        System.out.println(myInstance == myInstance2);

    }

}
