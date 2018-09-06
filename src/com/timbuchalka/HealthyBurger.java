package com.timbuchalka;

public class HealthyBurger extends Burger {
    private int lettuce;
    private int tomato;

    public HealthyBurger(String cooked) {
        super("Healthy Burger", "brown", cooked, 7);
    }
}
