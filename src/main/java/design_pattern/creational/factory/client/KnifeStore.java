package design_pattern.creational.factory.client;

import design_pattern.creational.factory.client.models.Knife;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType){
        Knife knife = createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.packageing();
        return knife;
    }

    public abstract Knife createKnife(String knifeType);

}
