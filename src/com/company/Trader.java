package com.company;

public class Trader {
    private String name;
    private Account account;
    private Trade trade;

    public Trader(String name, Account account, Trade trade){
        this.name=name;
        this.account=account;
        this.trade=trade;

    }

    public double addTrade(){
        return (trade.getPrice()*trade.getQuantity() + account.getTotalTradeValue());
    }
}
