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

    private int additionCounter;

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
                + "\n" + "The base price of your burger is: " + getBasePrice()
                + "\n" + "You have been entitled to " + getAdditionLimit() + "additions."
                + "\n" + "You have added " + getAdditionCounter() + " additions.: "
                + "\n" + "The overral price for the burger with chosen additions is: " + (getBasePrice() + 0.25 * this.additionCounter));
    }

    public int getAdditionCounter() {
        return additionCounter;
    }

    public int getAdditionLimit() {
        return additionLimit;
    }

    public void addTomato() {
        if (additionCounter < additionLimit) {
            this.tomato = this.tomato + 1;
            additionCounter++;
        }
    }

    public void addPickle() {
        if (additionCounter < additionLimit) {
            this.pickle = this.pickle + 1;
            additionCounter++;
        }
    }

    public void addLettuce() {
        if (additionCounter < additionLimit) {
            this.lettuce = this.lettuce + 1;
            additionCounter++;
        }
    }

    public void addOnion() {
        if (additionCounter < additionLimit) {
            this.onion = this.onion + 1;
            additionCounter++;
        } else {
            System.out.println("You have reached limit of additions");
        }
    }

    public void addAddition(int quantity, String additionName) {
        if (additionCounter < additionLimit) {
            switch (additionName) {
                case "onion":
                    this.onion += quantity;
                    additionCounter++;
                    break;
                case "pickle":
                    this.pickle += quantity;
                    additionCounter++;
                    break;
                case "tomato":
                    this.tomato += quantity;
                    additionCounter++;
                    break;
                case "lettuce":
                    this.lettuce += quantity;
                    additionCounter++;
                    break;
                default:
                    System.out.println("Unknown type");
                    break;
            }
        }
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

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setPickle(int pickle) {
        this.pickle = pickle;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public void setAdditionLimit(int additionLimit) {
        this.additionLimit = additionLimit;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
