package design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite_Housing implements Component_IStructure {


    private String address;
    private List<Component_IStructure> structures;

    public Composite_Housing(String address) {
        this.address = address;
        this.structures = new ArrayList<>();
    }

    public Component_IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public int addStructure(Component_IStructure component){
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public List<Component_IStructure> getStructures() {
        return structures;
    }

    @Override
    public void enter() {
        System.out.println("Enter Building " + this.getName());
    }

    @Override
    public void exit() {
        System.out.println("Exit Building" + this.getName());
    }

    @Override
    public void location() {
        System.out.printf("You are currently in {}. It Has", this.getName());
        for (Component_IStructure el: this.structures){
            System.out.println(el.getName());
        }
    }

    @Override
    public String getName() {
        return this.address;
    }
}
