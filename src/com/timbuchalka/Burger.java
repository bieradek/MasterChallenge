package com.timbuchalka;

public class Burger {
    private String name;
    private String breadRollType;
    private String cooked;
    private double basePrice;

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getCooked() {
        return cooked;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Burger(String name, String cooked) {
        this.name = name;
        this.breadRollType = "white";
        this.cooked = cooked;
        this.basePrice = 5.0;
    }
}
