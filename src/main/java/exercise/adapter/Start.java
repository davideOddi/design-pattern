package exercise.adapter;

public class Start {
    public static void main(String[] args) {
        CoffeTouchscreenAdapter adapter = new CoffeTouchscreenAdapter(new OldCoffeeMachine());
        adapter.chooseSecondtSelection();
        adapter.chooseFirstSelection();
    }
}
