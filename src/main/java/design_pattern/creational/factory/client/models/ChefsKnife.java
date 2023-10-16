package design_pattern.creational.factory.client.models;

public class ChefsKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("sharping chef knife");
    }

    @Override
    public void polish() {
        System.out.println("polish chef knife");
    }

    @Override
    public void packageing() {
        System.out.println("packageing chef knife");
    }
}
