package design_pattern.creational.factory.client.models;

public class BudgetChefsKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("sharping budget chef knife");
    }

    @Override
    public void polish() {
        System.out.println("polish budget chef knife");
    }

    @Override
    public void packageing() {
        System.out.println("packageing budget chef knife");
    }
}