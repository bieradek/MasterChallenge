package com.timbuchalka;

public class DeluxeBurger extends Burger {
    private String chips; //lays,crunchips etc
    private String drinks; //cola,pepsi etc

    public DeluxeBurger(String cooked, String chips, String drinks) {
        super("Deluxe", "white", cooked, 10, 0, 0, 0, 0);
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public double totalPrice() {
        return super.totalPrice();
    }
}
