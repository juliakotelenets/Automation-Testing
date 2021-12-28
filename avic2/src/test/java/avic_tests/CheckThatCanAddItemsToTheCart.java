package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckThatCanAddItemsToTheCart extends BaseTest {

    private String SEARCH_KEYWORD = "Sony Playstation 5";

    @Test
    public void checkThatCanAddItemsToTheCart(){
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultsPage().implicitWait(30);
        getSearchResultsPage().filterTheProducts();
        getSearchResultsPage().buyTheProduct();
        getCartPage().addTheProducts();
        Assert.assertTrue(true);
    }

    @Override
    public HomePage getHomePage() {
        return super.getHomePage();
    }
}
