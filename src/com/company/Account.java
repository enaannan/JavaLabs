package com.company;

public class Account {

   private double totalTradeValue;

   public Account(){
       this.totalTradeValue =0;
   }

    public double getTotalTradeValue() {
        return totalTradeValue;
    }

    public void setTotalTradeValue(double totalTradeValue) {
        this.totalTradeValue = totalTradeValue;
    }

    Trade [] trades = new Trade[100]; //holds an array of trade objects


}
