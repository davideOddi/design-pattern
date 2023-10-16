package design_pattern.structural.Decorator;

public class Concrete_BasicWebPage implements Interface_WebPage{

    String html;
    String styleSheet;
    String scripts;

    public Concrete_BasicWebPage(String html, String styleSheet, String scripts) {
        this.html = html;
        this.styleSheet = styleSheet;
        this.scripts = scripts;
    }

    @Override
    public void display() {
        System.out.println("Basic web page");
    }
}
