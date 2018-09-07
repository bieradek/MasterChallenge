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
    private int additionLimit = 4;

    public Burger(String cooked) {
        this.name = "Hamburger";
        this.breadRollType = "white";
        this.cooked = cooked;
        this.basePrice = 5;
        this.lettuce = 0;
        this.tomato = 0;
        this.pickle = 0;
        this.onion = 0;
    }

    public Burger(String name, String breadRollType, String cooked, double basePrice, int lettuce, int tomato, int pickle, int onion, int additionLimit) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.cooked = cooked;
        this.basePrice = basePrice;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickle = pickle;
        this.onion = onion;
        this.additionLimit = additionLimit;
    }

    public void addTomato(int tomato) {
        this.tomato = this.tomato + tomato;
        this.basePrice = this.basePrice + tomato * 0.25;
    }

    public void addPickle(int pickle) {
        this.pickle = this.pickle + pickle;
        this.basePrice = this.basePrice + pickle * 0.25;
    }

    public void addOnion(int onion) {
        this.onion = this.onion + onion;
        this.basePrice = this.basePrice + onion * 0.25;
    }

    public void addLettuce(int lettuce) {
        this.lettuce = this.lettuce + lettuce;
        this.basePrice = this.basePrice + lettuce * 0.25;
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
