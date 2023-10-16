package design_pattern.structural.adapter;

import com.google.gson.Gson;

public class Adapter_WebAdapter implements TargetInterface_WebRequester{

    private Adaptee_WebService service;

    public void connect(Adaptee_WebService currentService){
        this.service = currentService;
    }

    @Override
    public int request(Object obj) {
        String response = toJson(obj);
        if (response != null){
            return 200;
        }
        return 500;
    }

    private String toJson(Object input){
        Gson gson = new Gson();
        return gson.toJson(input);
    }
}
