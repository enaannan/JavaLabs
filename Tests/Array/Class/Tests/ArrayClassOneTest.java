package Tests.Array.Class.Tests;

import com.company.array.classes.ArrayClassOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayClassOneTest {
    @Test
    public void DeleteLateTestClassConstructorTest(){

        ArrayClassOne myArrayClass = new ArrayClassOne();

        Random rand = new Random();
        int randomInteger = rand.nextInt(11);

        Assert.assertEquals(myArrayClass.getMyArr(randomInteger),randomInteger+1);

    }
}
