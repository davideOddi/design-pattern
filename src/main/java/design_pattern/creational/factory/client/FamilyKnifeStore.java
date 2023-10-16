package design_pattern.creational.factory.client;

import design_pattern.creational.factory.client.models.ChefsKnife;
import design_pattern.creational.factory.client.models.Knife;
import design_pattern.creational.factory.client.models.SteakKnife;

public class FamilyKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String knifeType) {
        Knife knife = null;
        if(knifeType.equals("steak")){
            knife = new SteakKnife();
        }else if(knifeType.equals("chef")){
            knife = new ChefsKnife();
        }
        return knife;
    }
}
