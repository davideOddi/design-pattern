package design_pattern.behavioural.chain_of_responsability;

import java.util.HashMap;
import java.util.Map;

public class FAKE_Database {

    private final Map<String, String> users;

    public FAKE_Database(){
        users = new HashMap<>();
        users.put("username", "password");
        users.put("username_admin", "password_admin");
        users.put("username_admin", "password_admin");
    }

    public boolean isValidUser(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password){
        return users.get(username).equals(password);
    }

}
