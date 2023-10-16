package design_pattern.creational.factory.client.models;

public class SteakKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("sharping steak knife");
    }

    @Override
    public void polish() {
        System.out.println("polish steak knife");
    }

    @Override
    public void packageing() {
        System.out.println("packageing steak knife");
    }
}
