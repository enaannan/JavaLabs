package Tests;
import com.company.FundTrades;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class FundTradeTest {

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
        double dividendPercentage= rand.nextDouble();

        FundTrades fundTrade =  new FundTrades(ID,symbol,quantity,price,dividendPercentage);
        double actual = ((price * dividendPercentage)+price)*quantity;
        Assert.assertEquals(fundTrade.calcDividend(),actual,0.001);

    }
}
