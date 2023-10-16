package design_pattern.structural.adapter;

public class Client_WebClient {
    private TargetInterface_WebRequester webRequester;

    public Client_WebClient(TargetInterface_WebRequester requester){
        this.webRequester = requester;
    }

    private Object makeObject(){
        return null;
    }

    public void doWork(){
        Object obj = makeObject();
        int status = webRequester.request(obj);
        if (status == 200){
            System.out.println("OK");
        }else{
            System.out.println("NOT OK");
        }
    }

}
