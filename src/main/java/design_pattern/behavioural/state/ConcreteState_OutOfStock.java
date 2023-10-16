package design_pattern.behavioural.state;

public class ConcreteState_OutOfStock implements StateInteface{

    @Override
    public void insertDollar(Client_VendingMachine vendingMachine) {
        System.out.println("Inserted Dollar");
    }

    @Override
    public void ejectMoney(Client_VendingMachine vendingMachine) {
        System.out.println("releasing Dollar");
    }

    @Override
    public void dispense(Client_VendingMachine vendingMachine) {
        System.out.println("Product out of stock");
    }
}
