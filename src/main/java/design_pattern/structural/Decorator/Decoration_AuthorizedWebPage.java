package design_pattern.structural.Decorator;

public class Decoration_AuthorizedWebPage extends Decorator_WebPage{
    public Decoration_AuthorizedWebPage(Interface_WebPage page) {
        super(page);
    }
    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
    private void authenticateUser() {
        System.out.println("Autenthicating user");
    }
}



