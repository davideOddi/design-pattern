package design_pattern.creational.factory;

import design_pattern.creational.factory.client.BudgetKnifeStore;
import design_pattern.creational.factory.client.FamilyKnifeStore;
import design_pattern.creational.factory.client.KnifeStore;

public class FactoryMain {

    /*
    * Abstract Creator: with general behavior (abstract factoryMethod(), concrete ...operations())
    * Concrete Creator: with the implementation of factoryMethod()
    * Concrete Product: the types of product that factory can creates
    * Product: Final concrete object
    * */
    public static void main(String[] args) {
        KnifeStore budgetStore = new BudgetKnifeStore();
        budgetStore.orderKnife("steak");
        budgetStore.orderKnife("chef");
        KnifeStore familyStore = new FamilyKnifeStore();
        familyStore.orderKnife("steak");
    }
}
