package design_pattern.behavioural.state;

public class ConcreteState_Idle implements StateInteface{

    @Override
    public void insertDollar(Client_VendingMachine vendingMachine) {
        System.out.println("Dollar Inserted");
        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(Client_VendingMachine vendingMachine) {
        System.out.println("returning Money");
        vendingMachine.returnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());

    }

    @Override
    public void dispense(Client_VendingMachine vendingMachine) {
        System.out.println("releasing product");
        if (vendingMachine.getCount() > 1){
            vendingMachine.releaseProduct();
            vendingMachine.setState(vendingMachine.getIdleState());
        }else{
            vendingMachine.releaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStock());
        }
    }
}
