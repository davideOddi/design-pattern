package design_pattern.behavioural.state;

public interface StateInteface {

    public void insertDollar(Client_VendingMachine vendingMachine);
    public void ejectMoney(Client_VendingMachine vendingMachine);
    public void dispense(Client_VendingMachine vendingMachine);

}
