package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheLinkToYoutube extends BaseTest {

    @Test
    public void checkTheLinkToYoutube(){
        Assert.assertTrue(getHomePage().getYoutubeButton().isEnabled());
    }

}
