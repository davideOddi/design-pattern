package design_pattern.creational.singleton;

public class Singleton {

    public String getFieldString() {
        return fieldString;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    String fieldString;
    int fieldNumber;
    private static Singleton instance = null;

    public static Singleton getInstance(String string, int integer){
        if (instance == null){
            instance = new Singleton(string, integer);
        }
        return instance;
    }

    private Singleton(String string, int integer){
        this.fieldString = string;
        this.fieldNumber = integer;
    }

}
