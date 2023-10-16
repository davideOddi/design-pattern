package design_pattern.behavioural.chain_of_responsability;

public class Concrete_CheckRole extends AbstractHandler{

    @Override
    public boolean handle(String username, String password) {
        if (username.contains("_admin")){
            System.out.println("Landing on administrator page");
            return true;
        }
        System.out.println("Landing default page");
        return handleNext(username, password);
    }
}
