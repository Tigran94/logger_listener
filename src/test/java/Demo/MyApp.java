package Demo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class MyApp {

    @Test
    public void test1(){
        throw new SkipException("asf");
    }

    @Test
    public void test2(){
        Assert.assertEquals(true,false);
    }

    @Test
    public void test3(){
        Assert.assertEquals(true,true);
    }
}
