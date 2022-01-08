package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    private static String EXPECTED_PRICE = "110 ₴";
    private static String EXPECTED_TITLE = "Тушь для ресниц";

    @Test
    public void checkThatPhotosChanges(){
        getHomePage().fillSearchField();
        getHomePage().waitVisibilityOfElement(getHomePage().getSearchButton());
        getHomePage().clickOnSearchButton();
        getSearchResultsPage().waitVisibilityOfElement(getSearchResultsPage().getParfumeProduct());
        getSearchResultsPage().clickToParfumeProduct();
        getProductPage().waitVisibilityOfElement(getProductPage().getSecondImage());
        getProductPage().slideThePhotos();
        Assert.assertTrue(getProductPage().isBigImageDisplayed());
    }

    @Test
    public void checkTheTitle(){
        getHomePage().moveToMakeupCategory();
        getHomePage().waitVisibilityOfElement(getHomePage().getEyes());
        getHomePage().clickOnEyesButton();
        getHomePage().waitVisibilityOfElement(getHomePage().getMascara());
        getHomePage().clickOnMascaraButton();
        Assert.assertEquals(getSearchResultsPage().getTitleText(), EXPECTED_TITLE);
    }

    @Test
    public void checkThatPriceIsTheSame(){
        getHomePage().moveToHairCategory();
        getHomePage().waitVisibilityOfElement(getHomePage().getShampooProducts());
        getHomePage().clickOnShampooProduct();
        getSearchResultsPage().waitVisibilityOfElement(getSearchResultsPage().getShampooProduct());
        getSearchResultsPage().clickToShampoo();
        Assert.assertEquals(getSearchResultsPage().getTextOfPrice(), getProductPage().getTextProductPrice());
    }

    @Test
    public void checkThatPriceIncreases(){
        getHomePage().moveToHairCategory();
        getHomePage().waitVisibilityOfElement(getHomePage().getShampooProducts());
        getHomePage().clickOnShampooProduct();
        getSearchResultsPage().waitVisibilityOfElement(getSearchResultsPage().getShampooProduct());
        getSearchResultsPage().clickToShampoo();
        getProductPage().waitVisibilityOfElement(getProductPage().getBuyButton());
        getProductPage().clickOnBuyButton();
        getProductPage().waitVisibilityOfElement(getProductPage().getAddProduct());
        getProductPage().waitElementToBeClickable(getProductPage().getAddProduct());
        getProductPage().clickOnAddProductButton();
        getProductPage().waitTextToBePresented(getProductPage().getPriceInCart(), EXPECTED_PRICE);
        Assert.assertEquals(getProductPage().getTextFromPriceInCart(), EXPECTED_PRICE);
    }
}
