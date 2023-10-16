package design_pattern.behavioural.chain_of_responsability;

public abstract class AbstractHandler implements IHandler{

    private AbstractHandler next;

    public AbstractHandler setNext(AbstractHandler next){
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password){
        if (next == null){
            return true;
        }
        return next.handleNext(username, password);
    }

}
