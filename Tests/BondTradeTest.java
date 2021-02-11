package Tests;

import com.company.BondTrades;
import com.company.FundTrades;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class BondTradeTest {


    @Before
    public void setup(){


    }


    @Test
    public void calcDividendTest(){


        Random rand = new Random();
        String ID = rand.toString();
        String symbol=rand.toString();
        int quantity = rand.nextInt();
        double price= rand.nextDouble();
        double dividend= rand.nextDouble();

        BondTrades bondTrade =  new BondTrades(ID,symbol,quantity,price,dividend);
        double actual = dividend*quantity;
        Assert.assertEquals(bondTrade.calcDividend(),actual,0.001);

    }

}
