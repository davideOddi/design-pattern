package design_pattern.structural.composite;

public class Leaf_Room implements Component_IStructure{
    public String name;

    public Leaf_Room(String name){
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have enetered the " + this.name);
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently int the " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
