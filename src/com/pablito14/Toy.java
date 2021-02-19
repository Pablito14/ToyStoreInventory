package com.pablito14;

public class Toy implements Comparable{

    // Attributes
    private String name;
    private double price;

    // Constructor
    public Toy(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Instance methods
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


    //TODO: test it
    @Override
    public int compareTo(Toy other) {
        // if the names are same, return 0
        if(this.getName().equals(other.getName())) {
            return 0;

            // when this name comes first
        } else if(this.getName().compareTo(other.getName()) < 0) {
            return -1;

            // when the other name comes first
        } else {
            return 1;
        }
    }

    public String toString(){
        return "Toy: " + getName() + " Price: " + getPrice();
    }


}
