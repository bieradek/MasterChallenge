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
    private int additionCounter = 0;

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

    public void checkout() {
        System.out.println("*************CHECKOUT*************"
                + "\n" + "The base price of your " + getName() + " burger is: " + getBasePrice()
                + "\n" + "You have been entitled to " + getAdditionLimit() + " additions."
                + "\n" + "You have still " + (getAdditionLimit() - getAdditionCounter()) + " additions left."
                + "\n" + "You have added " + getAdditionCounter() + " additions.: "
                + "\n" + "The overral price for the burger with chosen additions is: " + (getBasePrice() + 0.25 * this.additionCounter));
    }

    public void addAddition(int quantity, String additionName) {
        if ((additionCounter < additionLimit) && (quantity <= additionLimit)) {
            switch (additionName) {
                case "onion":
                    this.onion += quantity;
                    additionCounter += quantity;
                    System.out.println(quantity + " " + additionName + " added");
                    break;
                case "pickle":
                    this.pickle += quantity;
                    additionCounter += quantity;
                    System.out.println(quantity + " " + additionName + " added");
                    break;
                case "tomato":
                    this.tomato += quantity;
                    additionCounter += quantity;
                    System.out.println(quantity + " " + additionName + " added");
                    break;
                case "lettuce":
                    this.lettuce += quantity;
                    additionCounter += quantity;
                    System.out.println(quantity + " " + additionName + " added");
                    break;
                default:
                    System.out.println("Unknown type. Nothing has been added");
                    break;
            }
        } else {
            System.out.println("You cannot add more additions");
        }
    }

    public int getAdditionCounter() {
        return additionCounter;
    }

    public int getAdditionLimit() {
        return additionLimit;
    }

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

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getPickle() {
        return pickle;
    }

    public int getOnion() {
        return onion;
    }

    public void setName(String name) {
        this.name = name;
    }
}
