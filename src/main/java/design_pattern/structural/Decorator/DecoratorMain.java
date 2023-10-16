package design_pattern.structural.Decorator;

public class DecoratorMain {
    /**
     * Abstract class to aggregate other class in a stack using polymorphism
     * */
    public static void main(String[] args) {
        Interface_WebPage basepage = new Concrete_BasicWebPage("Html page", "stylesheet", "Javascript");
        basepage = new Decoration_AuthenticatedWebPage(basepage);
        basepage = new Decoration_AuthorizedWebPage(basepage);
        basepage.display();
    }
}
