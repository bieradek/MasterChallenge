package com.timbuchalka;

public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Burger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = 5.0;
    }
}
