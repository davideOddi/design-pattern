package design_pattern.structural.Decorator;

public class Decoration_AuthenticatedWebPage extends Decorator_WebPage{
    public Decoration_AuthenticatedWebPage(Interface_WebPage page) {
        super(page);
    }

    public void authorizedUser(){
        System.out.println("Authorizing User");
    }

    @Override
    public void display() {
        super.display();
        this.authorizedUser();
    }
}
