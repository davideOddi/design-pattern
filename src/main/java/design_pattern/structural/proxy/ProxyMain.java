package design_pattern.structural.proxy;

public class ProxyMain {

    /**
     * Lightweight version of the original object
     * for example:
     * 1 - subsitute high resource object
     * 2 - protection in order to control access to the real subject class
     * 3 - remote proxy, proxy class il local and subject exist in remote
     * */
    public static void main(String[] args) {
        ISubject_Internet internet = new ProxyClass_ProxInternet();
        internet.connectTo("weapon");
        internet.connectTo("google.com");
        internet.connectTo("otherStuff.com");
    }

}
