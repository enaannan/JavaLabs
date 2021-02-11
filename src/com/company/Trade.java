package com.company;
import java.time.LocalDate;
import java.time.LocalTime;


public abstract class Trade {

   private String ID;
   private String symbol;
   private LocalTime time ;
   private LocalDate date ;

    public int getQuantity() {
        return quantity;
    }

    protected int quantity;
   protected double price;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public void setPrice(double price) {
        if (price>=0.0) {
            this.price = price;

        }
    }

    abstract double calcDividend();

    public LocalTime getTime() {
        return time;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String  toString(){

        return ("");// should print out object
    }
}
