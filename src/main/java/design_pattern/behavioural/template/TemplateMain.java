package design_pattern.behavioural.template;

public class TemplateMain {
    /**When different object make similar steps I can extract the steps in an abstract class with a final template
     * template abstract class has allways a FINAL method to don't allow modification by subclasses
     * */

    public static void main(String[] args) {
        Concrete_PenneAlfredo alfredoDish = new Concrete_PenneAlfredo();
        Concrete_SpaghettiMeatBalls spaghettiMeatBalls = new Concrete_SpaghettiMeatBalls();

        alfredoDish.makeRecipe();
        spaghettiMeatBalls.makeRecipe();
    }
}
