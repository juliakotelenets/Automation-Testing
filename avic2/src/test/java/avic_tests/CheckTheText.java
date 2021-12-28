package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheText extends BaseTest {

    @Test
    public void checktheTitle(){
        Assert.assertEquals(getHomePage().getTextOfTitle(),"Популярні товари", "Passed");
    }
}
