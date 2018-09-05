package com.timbuchalka;

public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;

    private String lettuce;
    private String tomato;
    private String pickle;
    private String onion;

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

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public void setPickle(String pickle) {
        this.pickle = pickle;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    public Burger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = 5.0;
    }
}

class HealthyBurger extends Burger {
    private String lettuce;
    private String tomato;

    public HealthyBurger(String name, String breadRollType, String meat, String lettuce, String tomato) {
        super(name, breadRollType, meat);
        this.lettuce = lettuce;
        this.tomato = tomato;
    }
}

class DeluxeBurger extends Burger {
    private String chips;
    private String drinks;

    public DeluxeBurger(String name, String breadRollType, String meat, String chips, String drinks) {
        super(name, breadRollType, meat);
        this.chips = chips;
        this.drinks = drinks;
    }
}
