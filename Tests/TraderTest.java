package Tests;

import com.company.Account;
import com.company.BondTrades;
import com.company.Trade;
import com.company.Trader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TraderTest {
    @Test
    public void addTradeTest(){

        Random random = new Random();
        double totalTradeValue= random.nextDouble();

        Account myAccount = new Account();
        myAccount.setTotalTradeValue(totalTradeValue);

        String id = random.toString();
        String symbol = random.toString();
        int quantity = random.nextInt();
        double price = random.nextDouble();
        String name = random.toString();
        double dividend = 100.0;

        BondTrades trade = new BondTrades(id,symbol, quantity, price,dividend);

        Trader trader = new Trader(name,myAccount,trade);



        double result = (price * quantity)+ totalTradeValue;
        Assert.assertEquals( trader.addTrade(),result,0.001);

    }
}
