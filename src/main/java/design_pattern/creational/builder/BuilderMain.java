package design_pattern.creational.builder;

public class BuilderMain {


    public static void main(String[] args) {

        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .build();

        System.out.println(comp);
    }


}
