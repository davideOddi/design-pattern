package design_pattern.structural.Decorator;

public abstract class Decorator_WebPage implements Interface_WebPage{
    private Interface_WebPage page;

    public Decorator_WebPage(Interface_WebPage page){
        this.page = page;
    }

    @Override
    public void display() {
        this.page.display();
    }
}
