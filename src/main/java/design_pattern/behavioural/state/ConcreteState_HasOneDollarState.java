package design_pattern.behavioural.state;

public class ConcreteState_HasOneDollarState implements StateInteface{

    @Override
    public void insertDollar(Client_VendingMachine vendingMachine) {
        System.out.println("already have one dollar");
        vendingMachine.returnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void ejectMoney(Client_VendingMachine vendingMachine) {

    }

    @Override
    public void dispense(Client_VendingMachine vendingMachine) {

    }
}
