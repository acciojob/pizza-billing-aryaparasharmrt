package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private static boolean cheese;
    private static boolean bag;
    private  boolean toppings;

    private int total = 0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){

        if(isVeg) {
            this.price = 300;
            total += this.price;
            return this.price;
        }
        else {
            this.price = 400;
            this.total += this.price;
            return this.price;
        }
    }

    public void addExtraCheese(){
        if(!cheese) {
            System.out.println("Extra Cheese Added: " + 80);
            this.total += 80;
            cheese = true;
        }
    }

    public void addExtraToppings(){
        if(!toppings){
            total += isVeg? 70:120;
            System.out.println("Extra Toppings Added: " + (isVeg? 70:120));
            toppings = true;
        }
    }

    public void addTakeaway(){
        if(!bag) {
            System.out.println("Paper bag Added: " + 20);
            this.total += 20;
            bag = true;
        }
    }

    public String getBill(){
        this.bill = Integer.toString(this.total);
        return this.bill;
    }
}
