package com.timbuchalka;

public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

//    private String lettuce;
//    private String tomato;
//    private String pickle;
//    private String onion;

    public Burger(String breadRollType, String meat, String lettuce, String tomato, String pickle, String onion) {
        this.breadRollType = breadRollType;
        this.meat = meat;
    }
}
