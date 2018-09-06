package com.timbuchalka;

public class Burger {
    private String name;
    private String breadRollType;
    private String cooked;
    private double basePrice;

    private int lettuce;
    private int tomato;
    private int pickle;
    private int onion;

    public Burger(String name, String breadRollType, String cooked, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.cooked = cooked;
        this.basePrice = basePrice;
    }

    public double totalPrice() {
        return this.basePrice + ((0.25) * (this.lettuce + this.tomato + this.pickle + this.onion));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public int getPickle() {
        return pickle;
    }

    public void setPickle(int pickle) {
        this.pickle = pickle;
    }

    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }
}
