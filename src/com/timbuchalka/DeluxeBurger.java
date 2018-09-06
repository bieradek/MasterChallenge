package com.timbuchalka;

public class DeluxeBurger extends Burger {
    private int chips;
    private int drinks;

    public DeluxeBurger(String cooked) {
        super("DELUXE BURGER", "white", cooked, 10);
        this.chips = 1;
        this.drinks = 1;
    }
    @Override
    public double totalPrice() {
        return super.totalPrice();
    }
}
