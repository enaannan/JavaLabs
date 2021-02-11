package Tests;

import com.company.enums.MembershipTypeEnum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class MembershipTypeEnumTest {

    @Test
    public  void bronzeCanTradeTest(){
        MembershipTypeEnum bronze = MembershipTypeEnum.BRONZE;
        Random random = new Random();
        int loopLimit = random.nextInt(10);

        for(int i=0;i<loopLimit;i++){
            bronze.canTrade();
        }
        if (loopLimit<5){
            Assert.assertEquals(bronze.canTrade(),true);
        }else{
            Assert.assertEquals(bronze.canTrade(),false);
        }
    }



    @Test
    public  void silverCanTradeTest(){
        MembershipTypeEnum silver = MembershipTypeEnum.SILVER;
        Random random = new Random();
        int loopLimit = random.nextInt(10);

        for(int i=0;i<loopLimit;i++){
            silver.canTrade();
        }
        if (loopLimit<=10){
            Assert.assertEquals(silver.canTrade(),true);
        }else{
            Assert.assertEquals(silver.canTrade(),false);
        }
    }





    @Test
    public  void goldCanTradeTest(){
        MembershipTypeEnum gold = MembershipTypeEnum.GOLD;
        Random random = new Random();
        int loopLimit = random.nextInt(10);

        for(int i=0;i<loopLimit;i++){
            gold.canTrade();
        }
        if (loopLimit<=20){
            Assert.assertEquals(gold.canTrade(),true);
        }else{
            Assert.assertEquals(gold.canTrade(),false);
        }
    }

}
