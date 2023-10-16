package design_pattern.behavioural.chain_of_responsability;

public class ChainOfResponsabilityMain {

    /** Similar to throwing Exception in Java use template pattern to handle a request and if can't to pass the request to the next handler
     * doesn't matter for requester wich handler will handle the request
     * 1 - Handler to handle a specific request
     * 2 - if Handler can't handle the request it will pass the request to the next handler
     * */

    public static void main(String[] args) {
        FAKE_Database database = new FAKE_Database();
        AbstractHandler handler = new ConcreteHandler_ValidatUsername(database)
                .setNext(new Concrete_ValidatePassword(database))
                .setNext(new Concrete_CheckRole());
        Client_AuthService client = new Client_AuthService(handler);
        client.login("asd", "password");
    }

}
