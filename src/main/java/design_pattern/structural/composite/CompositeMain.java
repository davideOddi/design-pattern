package design_pattern.structural.composite;

public class CompositeMain {
    /**
    * Compose nested structures of objects using polymorphism (Recursive Composition - Tree)
     * ComponentInterface: supertype for a set of classes
     * Composite: subclass of component
     * Leaf: non composite type
    * */
    public static void main(String[] args) {
        Composite_Housing building = new Composite_Housing("123 Street");
            Composite_Housing floor1 = new Composite_Housing("123 Street - First Floor");
            int firstFloor = building.addStructure(floor1);
                Leaf_Room washroom1 = new Leaf_Room("1F Men's Washroom");
                Leaf_Room washroom2 = new Leaf_Room("1F Women's Washroom");
                Leaf_Room commonArea = new Leaf_Room("1F CommonArea");

        int firstMens = floor1.addStructure(washroom1);
        int firstWomans = floor1.addStructure(washroom2);
        int firstCommon = floor1.addStructure(commonArea);

        building.enter();
        Composite_Housing currentFloor = (Composite_Housing) building.getStructure(firstFloor);
        currentFloor.enter();
        Leaf_Room currentRoom = (Leaf_Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = (Leaf_Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter();
    }
}
