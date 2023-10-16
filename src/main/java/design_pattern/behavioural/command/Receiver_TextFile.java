package design_pattern.behavioural.command;

public class Receiver_TextFile {

    private String name;

    public Receiver_TextFile(String name){
        this.name = name;
    }

    public String open(){
        String result = "Opening file " + this.name;
        System.out.println(result);
        return result;
    }

    public String save(){
        String result = "Saving file " + this.name;
        System.out.println(result);
        return result;
    }

}
