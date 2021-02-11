package com.company;

public class BondTrades extends  Trade{

     static double dividend;

    public BondTrades(String ID, String symbol, int quantity, double price,double dividend) {
        super(ID, symbol, quantity, price);
this.dividend = dividend;
    }

    public BondTrades(String ID, String symbol, int quantity) {
        super(ID, symbol, quantity);

    }




    @Override
   public double calcDividend() {
return dividend * this.quantity;
    }
}
