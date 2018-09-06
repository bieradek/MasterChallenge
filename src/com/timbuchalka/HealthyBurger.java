package com.timbuchalka;

public class HealthyBurger extends Burger {
    private int lettuce;
    private int tomato;

    public HealthyBurger(String cooked) {
        super("Healthy Burger", "brown", cooked, 7);
        this.lettuce = 1;
        this.tomato = 1;
    }

    @Override
    public double totalPrice() {
        return super.totalPrice();
    }
}
