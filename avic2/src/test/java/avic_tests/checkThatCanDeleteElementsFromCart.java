package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class checkThatCanDeleteElementsFromCart extends BaseTest{

    private String SEARCH_KEYWORD = "Sony Playstation 5";
    private String EXPECTED_AMOUNT_OF_PRODUCTS = "0";

    @Test
    public void checkThatCanDeleteElementsFromCart() throws InterruptedException {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultsPage().waitForLoadingPage(30);
        getSearchResultsPage().buyTheProduct();
        getCartPage().waitVisibility(30,getCartPage().getAddToCartPopup());
        getCartPage().deleteTheProduct();
        getCartPage().threadSleep(200);
        Assert.assertEquals(getHomePage().getTextOfProductsInCart(),EXPECTED_AMOUNT_OF_PRODUCTS);
    }
}
