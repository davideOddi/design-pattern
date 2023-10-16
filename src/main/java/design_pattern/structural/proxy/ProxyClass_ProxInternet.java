package design_pattern.structural.proxy;

import java.util.LinkedList;
import java.util.List;

public class ProxyClass_ProxInternet implements ISubject_Internet{

    List<String> bannedSites = new LinkedList<>();
    private final ISubject_Internet internet = new SubjectClass_realInternet();

    public ProxyClass_ProxInternet(){
        bannedSites.add("pornStuff");
        bannedSites.add("weapon");
        bannedSites.add("kidnapping");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host)){
            System.out.println("ACCESS DENIED");
            return;
        }
        internet.connectTo(host);
    }
}
