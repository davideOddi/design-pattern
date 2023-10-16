package design_pattern.behavioural.template;

public class Concrete_PenneAlfredo extends Abstract_PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Adding penne");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding Alfredo's sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding chicken");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding parsley");
    }
}
