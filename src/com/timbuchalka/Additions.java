package com.timbuchalka;

public class Additions extends Burger {
    private String lettuce;
    private String tomato;
    private String pickle;
    private String onion;
    private double additionCost = 1;

    public Additions(String name, String cooked, String lettuce, String tomato, String pickle, String onion, double additionCost) {
        super(name, cooked);
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickle = pickle;
        this.onion = onion;
        this.additionCost = additionCost;
    }

    public double getAdditionCost() {
        return additionCost;
    }

    public void setAdditionCost(double additionCost) {
        this.additionCost = additionCost;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getPickle() {
        return pickle;
    }

    public void setPickle(String pickle) {
        this.pickle = pickle;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }
}
