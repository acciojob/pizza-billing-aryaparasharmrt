package com.driver;

import org.w3c.dom.ls.LSOutput;

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
        price = this.isVeg?300:400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheese) {
            this.total += 80;
            cheese = true;
        }
    }

    public void addExtraToppings(){
        if(!toppings){
            total += isVeg? 70:120;
            toppings = true;
        }
    }

    public void addTakeaway(){
        if(!bag) {
            this.total += 20;
            bag = true;
        }
    }

    public String getBill(){
        String bill = "Base Price Of The Pizza: " + (isVeg? 300: 400) + "\n"
                + (cheese? "Extra Cheese Added: "+ 80:""+ "\n") +
                (toppings ?"Extra Toppings Added: "+(isVeg ?70: 120) :"" + "\n") +
                (bag ? "Paper Bag Added: "+20:"" + "\n")  +
                "Total Price: "+this.total;
        return bill;
    }
}
