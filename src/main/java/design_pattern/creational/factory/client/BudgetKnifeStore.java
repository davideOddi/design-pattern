package design_pattern.creational.factory.client;

import design_pattern.creational.factory.client.models.BudgetChefsKnife;
import design_pattern.creational.factory.client.models.BudgetSteakKnife;
import design_pattern.creational.factory.client.models.Knife;

public class BudgetKnifeStore extends KnifeStore{

    @Override
    public Knife createKnife(String knifeType) {
        Knife knife = null;
        if(knifeType.equals("steak")){
            knife = new BudgetSteakKnife();
        }else if(knifeType.equals("chef")){
            knife = new BudgetChefsKnife();
        }
        return knife;
    }
}
