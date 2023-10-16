package design_pattern.behavioural.chain_of_responsability;

public class Concrete_ValidatePassword extends AbstractHandler{

    private FAKE_Database database;

    public Concrete_ValidatePassword(FAKE_Database database){
        super();
        this.database = database;
    }


    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidPassword(username, password)){
            System.out.println("Invalid password");
            return false;
        }
        return handleNext(username, password);
    }
}
