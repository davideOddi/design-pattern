package design_pattern.behavioural.chain_of_responsability;

public class ConcreteHandler_ValidatUsername extends AbstractHandler{

    private FAKE_Database database;

    public ConcreteHandler_ValidatUsername(FAKE_Database database){
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)){
            System.out.println(username + " Not registered");
            System.out.println("Sign up!!");
            return false;
        }
        return handleNext(username, password);
    }
}
