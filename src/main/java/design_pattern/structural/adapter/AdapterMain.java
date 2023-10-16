package design_pattern.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        /**
         * Client: the part that want uses third-party or external library
         * Adaptee: the class from third-party or external library
         * Target Interface: the interface called by Client
         * Adapter: between Client and Adaptee to Wrap adaptee to Target Interface . Will implement a target interface that client will use
         *
         * Client will call -> Taget Interface -> Adapter make comprehensible the call for the Adaptee
         */

        String webHost = "https://google.com\n\r";
        Adaptee_WebService service = new Adaptee_WebService(webHost);
        Adapter_WebAdapter adapter = new Adapter_WebAdapter();
        adapter.connect(service);
        Client_WebClient client = new Client_WebClient(adapter);
        client.doWork();



    }
}
