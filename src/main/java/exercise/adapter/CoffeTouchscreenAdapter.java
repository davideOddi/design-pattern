package exercise.adapter;

public class CoffeTouchscreenAdapter implements CoffeeMachineInterface{
    private OldCoffeeMachine coffeeMachine;

    public CoffeTouchscreenAdapter(OldCoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }


    @Override
    public void chooseFirstSelection() {
        coffeeMachine.selectA();
    }

    @Override
    public void chooseSecondtSelection() {
        coffeeMachine.selectB();
    }
}
