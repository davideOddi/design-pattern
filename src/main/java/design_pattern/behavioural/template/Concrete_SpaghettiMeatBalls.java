package design_pattern.behavioural.template;

public class Concrete_SpaghettiMeatBalls extends Abstract_PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Adding spaghetti");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding tomato sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding meatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding cheese");
    }
}
