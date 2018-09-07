package com.timbuchalka;

public class DeluxeBurger extends Burger {
    private String chips; //lays,crunchips etc
    private String drinks; //cola,pepsi etc

    public DeluxeBurger(String cooked, String chips, String drinks) {
        super("Deluxe", "white", cooked, 10, 1, 1, 1, 1, 0);
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public void addAddition(int quantity, String additionName) {
        System.out.println("There are no additions allowed for your order");
    }

    @Override
    public void checkout() {
        System.out.println("The overall price for your " + getName() + " burger is 10$");
    }
}
