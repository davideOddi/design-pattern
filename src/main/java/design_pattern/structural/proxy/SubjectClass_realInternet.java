package design_pattern.structural.proxy;

import java.util.Hashtable;

public class SubjectClass_realInternet implements ISubject_Internet{

    @Override
    public void connectTo(String host) {
        System.out.printf("Opened connection to %s%n", host);
    }
}
