package design_pattern.behavioural.state;

public class Client_VendingMachine {

    private ConcreteState_Idle idle;
    private ConcreteState_HasOneDollarState hasOneDollar;
    private ConcreteState_OutOfStock outOfStock;
    private StateInteface currentState;
    private int count;

    public Client_VendingMachine(int count){
        idle = new ConcreteState_Idle();
        hasOneDollar = new ConcreteState_HasOneDollarState();
        outOfStock = new ConcreteState_OutOfStock();
        if (count > 0){
            currentState = idle;
            this.count = count;
        }else{
            currentState = outOfStock;
            this.count = 0;
        }
    }

    public void setState(StateInteface state){
        this.currentState = state;
    }

    public void returnMoney() {
        System.out.println("Returning Dollar");
    }


    public ConcreteState_Idle getIdleState() {
        return idle;
    }

    public ConcreteState_HasOneDollarState getHasOneDollarState() {
        return hasOneDollar;
    }

    public ConcreteState_OutOfStock getOutOfStock() {
        return outOfStock;
    }

    public int getCount(){
        return this.count;
    }

    public void insertDollar(){
        currentState.insertDollar(this);
    }

    public void ejectMoney(){
        currentState.ejectMoney(this);
    }
    public void releaseProduct() {
        currentState.dispense(this);
    }
}
