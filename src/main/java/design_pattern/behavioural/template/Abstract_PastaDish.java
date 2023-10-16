package design_pattern.behavioural.template;

public abstract class Abstract_PastaDish {
    public final void makeRecipe(){
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater(){
        System.out.println("Boiling Pasta");
    }

    private void cookPasta(){
        System.out.println("cooking pasta");
    }

    private void drainAndPlate(){
        System.out.println("Drain and Plate");
    }

}
