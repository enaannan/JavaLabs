package com.company;

public class FundTrades extends Trade{

static double dividendPercentage;



    public FundTrades(String ID, String symbol, int quantity, double price, double dividendPercentage) {
        super(ID, symbol, quantity, price);
        this.dividendPercentage = dividendPercentage;
    }

    public FundTrades(String ID, String symbol, int quantity) {
        super(ID, symbol, quantity);
    }

    @Override
   public double calcDividend() {
        return ((this.price * dividendPercentage)+this.price)*this.quantity;
    }
}
