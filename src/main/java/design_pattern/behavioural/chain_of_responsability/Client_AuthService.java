package design_pattern.behavioural.chain_of_responsability;

public class Client_AuthService {

    private AbstractHandler handler;

    public Client_AuthService(AbstractHandler handler){
        this.handler = handler;
    }

    public boolean login(String email, String password){
        if(handler.handle(email, password)){
            System.out.println("Authorization was successful!");
            return true;
        }
        return false;
    }


}
