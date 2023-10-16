package design_pattern.creational.factory.client.models;

public class BudgetSteakKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("sharping budget steak knife");
    }

    @Override
    public void polish() {
        System.out.println("polish budget steak knife");
    }

    @Override
    public void packageing() {
        System.out.println("packageing budget steak knife");
    }
}