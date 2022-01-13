package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    WebDriver driver;
    HomePage homePage;
    HeelsPage heelsPage;
    ProductPage productPage;
    WishListPage wishListPage;
    WomenClothesPage womenClothesPage;
    PageFactoryManager pageFactoryManager;
    RegisterPage registerPage;
    SearchResultsPage searchResultsPage;
    DressesPage dressesPage;
    MenClothesPage menClothesPage;
    ShortsPage shortsPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() { driver.close(); }

    @And("User opens {string} page")
    public void openPage(final String url){
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks that Facebook button is enabled")
    public void checkThatFacebookButtonIsEnabled(){
        homePage.waitVisibilityOfElement(homePage.getFacebookButton());
        assertTrue(homePage.checkThatButtonIsEnabled(
                homePage.getFacebookButton()));
    }

    @And("User checks that Instagram button is enabled")
    public void checkThatInstagramButtonIsEnabled(){
        homePage.waitVisibilityOfElement(homePage.getInstagramButton());
        assertTrue(homePage.checkThatButtonIsEnabled(
                homePage.getInstagramButton()
        ));
    }

    @And("User checks that Snapchat button is enabled")
    public void checkThatSnapchatButtonIsEnabled(){
        homePage.waitVisibilityOfElement(homePage.getSnapchatButton());
        assertTrue(homePage.checkThatButtonIsEnabled(
                homePage.getSnapchatButton()
        ));
    }

    @And("User clicks on women clothes button")
    public void userClickOnWomenClothesButton(){
        homePage.waitVisibilityOfElement(homePage.getWomenClothesButton());
        homePage.clickOnWomenClothesButton();
    }

    @And("User waiting for the women clothes page to load")
    public void userChecksVisibilityOfWomenCategory(){
        womenClothesPage = pageFactoryManager.getWomenClothesPage();
        womenClothesPage.waitForPageLoadComplete();
    }

    @And("User moves mouse to shoes category")
    public void userMoveToShoesButton(){
        womenClothesPage.waitVisibilityOfElement(womenClothesPage.getShoesButton());
        womenClothesPage.moveToShoesButton();
    }

    @And("User clicks on heels category button")
    public void userClickOnHeelsButton(){
        womenClothesPage.waitVisibilityOfElement(womenClothesPage.getHeelsButton());
        womenClothesPage.clickOnHeelsButton();
    }

    @And("User waiting for the heels page to load")
    public void userChecksVisibilityOfHeelProduct(){
        heelsPage = pageFactoryManager.getHeelsPage();
        heelsPage.waitForPageLoadComplete();
    }

    @And("User chooses the shoes and click on it")
    public void userClickOnProductHeelButton(){
        heelsPage.waitVisibilityOfElement(heelsPage.getProductHeel());
        heelsPage.clickOnProductHeelButton();
    }

    @And("User waiting for the product page to load")
    public void userChecksVisibilityOfProductPage(){
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete();
    }

    @And("User clicks on add to wish list button")
    public void userClickOnAddToWishListButton(){
        productPage.waitElementToBeClickable(productPage.getAddToWishList());
        productPage.clickAddToWishList();
    }

    @And("User clicks on wish list page")
    public void userClickOnWishListPage(){
        productPage.waitElementToBeClickable(productPage.getWishList());
        productPage.clickOnWishList();
    }

    @And("User waiting for the wish list page to load")
    public void userChecksVisibilityOfWishList(){
        wishListPage = pageFactoryManager.getWishListPage();
        wishListPage.waitForPageLoadComplete();
    }

    @And("User checks that count of products in wish list are {string}")
    public void checksCountOfProductsInWishList(String count){
        wishListPage.waitVisibilityOfElement(wishListPage.getCountOfProductInWishList());
        wishListPage.waitTextToBePresented(wishListPage.getCountOfProductInWishList(), count);
        Assert.assertEquals(wishListPage.getTextCountOfProduct(), count);
    }

    @And("User checks the product article with {string}")
    public void userChecksTheProductArticle(String name){
        heelsPage.waitVisibilityOfElement(heelsPage.getNameOfProduct());
        Assert.assertEquals(heelsPage.getTextNameOfProduct(), name);
    }

    @And("User moves mouse to account button")
    public void userMovesMouseToAccountButton(){
        homePage.waitVisibilityOfElement(homePage.getAccountButton());
        homePage.moveToAccountButton();
    }

    @And("User clicks on sign up button")
    public void userClicksOnSignUpButton(){
        homePage.waitVisibilityOfElement(homePage.getSignUpButton());
        homePage.clickOnSignUp();
    }

    @And("User waiting for the register page to load")
    public void checksVisibilityOfRegisterPage(){
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.waitForPageLoadComplete();
    }

    @And("User fills the email field with {string}")
    public void userFillsTheEmailField(String email){
        registerPage.waitVisibilityOfElement(registerPage.getEmailField());
        registerPage.fillEmailField(email);
    }

    @And("User fills the name field with {string}")
    public void userFillsTheNameField(String name){
        registerPage.waitVisibilityOfElement(registerPage.getFirstNameField());
        registerPage.fillFirstNameField(name);
    }

    @And("User fills the last name field with {string}")
    public void userFillsTheLastNameField(String lastName){
        registerPage.waitVisibilityOfElement(registerPage.getLastNameField());
        registerPage.fillLastNameField(lastName);
    }

    @And("User fills the password field with {string}")
    public void userFillsThePasswordField(String password){
        registerPage.waitVisibilityOfElement(registerPage.getPasswordField());
        registerPage.fillPasswordField(password);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton(){
        registerPage.waitVisibilityOfElement(registerPage.getSubmitButton());
        registerPage.clickOnSubmitButton();
    }

    @And("User checks that error message is displayed")
    public void userChecksThatErrorMessageIsDisplayed() {
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayError());
        Assert.assertTrue(registerPage.checkThatBirthdayErrorIsDisplayed());
    }

    @And("User fills the birthday data")
    public void userFillTheBirthdayData(){
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayDayButton());
        registerPage.clickOnBirthdayDayButton();
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayDay());
        registerPage.clickOnBirthdayDay();
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayMonthButton());
        registerPage.clickOnBirthdayMonthButton();
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayMonth());
        registerPage.clickOnBirthdayMonth();
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayYearButton());
        registerPage.clickOnBirthdayYearButton();
        registerPage.waitVisibilityOfElement(registerPage.getBirthdayYear());
        registerPage.clickOnBirthdayYear();
    }

    @And("User checks that error about incorrectly filled data is displayed")
    public void checksThatErrorAboutIncorrectlyFilledDataIsDisplayed(){
        registerPage.waitVisibilityOfElement(registerPage.getPasswordError());
        registerPage.passwordErrorIsDisplayed();
    }

    @And("User search the {string}")
    public void fillTheSearchInput(String input){
        homePage.waitVisibilityOfElement(homePage.getSearchInputField());
        homePage.fillTheSearchInputField(input);
    }

    @And("User waiting for the search result page to load")
    public void checksVisibilityOfSearchResultsPage(){
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete();
    }

    @And("User checks the title of {string}")
    public void userChecksTheTitleOfSearh(String title){
        searchResultsPage.waitVisibilityOfElement(searchResultsPage.getTitleOfSearchHeels());
        Assert.assertEquals(searchResultsPage.getTextTitleSearchHeels(), title);
    }

    @And("User moves mouse to clothing category")
    public void userMovesMouseToClothingCategory(){
        womenClothesPage.waitVisibilityOfElement(womenClothesPage.getClothingButton());
        womenClothesPage.moveToClothingButton();
    }

    @And("User clicks on dresses category")
    public void userClicksOnDressesCategory(){
        womenClothesPage.waitVisibilityOfElement(womenClothesPage.getDressesCategory());
        womenClothesPage.clickOnDressesCategory();
    }

    @And("User waiting for the dresses page to load")
    public void userCheksVisibilityOfDressesPage(){
        dressesPage = pageFactoryManager.getDressesPage();
        dressesPage.waitForPageLoadComplete();
    }

    @And("User clicks on size button")
    public void userClicksOnSizeButton(){
        //dressesPage.waitVisibilityOfElement(dressesPage.getSizeButton());
        dressesPage.clickOnSizeButton();
    }

    @And("User choose the size of dress")
    public void userChooseTheSize(){
        //dressesPage.waitVisibilityOfElement(dressesPage.getUK16Size());
        dressesPage.clickOn16Size();
    }

    @And("User choose dress product")
    public void userChooseTheDress(){
        dressesPage.waitForPageLoadComplete();
        dressesPage.waitVisibilityOfElement(dressesPage.getDressProduct());
        dressesPage.clickOnDressProductPage();
    }

    @And("User clicks on select size button")
    public void userClicksOnSelectSizeButton(){
//        productPage.waitForPageLoadComplete();
        productPage.waitVisibilityOfElement(productPage.getSelectSizeButton());
        productPage.clickOnSelectSizeButton();
    }

    @And("User checks that all sizes contains expected {string}")
    public void userChecksThatSizeContains(String size){
        productPage.waitVisibilityOfListElements(productPage.getListOfSizes());
        Assert.assertTrue(productPage.verifyThatSizeEqualsExpected(
                productPage.getSizesString(productPage.getSizeByIndex(1)), size));
    }

    @And("User choose the hoodie product")
    public void userChooseTheHoodieProduct(){
        searchResultsPage.waitVisibilityOfElement(searchResultsPage.getHoodieProduct());
        searchResultsPage.clickOnHoodieProduct();
    }

    @And("User clicks on buy button")
    public void userClicksOnBuyButton(){
        productPage.waitVisibilityOfElement(productPage.getBuyButton());
        productPage.clickOnBuyButton();
    }

    @And("User checks that select size error is displayed")
    public void userChecksThatSelectSizeErrorIsDisplayed(){
        productPage.waitVisibilityOfElement(productPage.getSelectSizeError());
        productPage.selectSizeErrorIsDisplayed();
    }

    @And("User clicks on men clothes category")
    public void userClicksOnMenClithesCategory(){
        homePage.waitVisibilityOfElement(homePage.getMenClothesButton());
        homePage.clickOnMenClothesButton();
    }

    @And("User waiting for the men clothes page to load")
    public void userWaitingForMenClothesPage(){
        menClothesPage = pageFactoryManager.getMenClothesPage();
        menClothesPage.waitForPageLoadComplete();
    }

    @And("User moves mouse to sportswear button")
    public void userMovesMouseToSportswearButton(){
        menClothesPage.waitVisibilityOfElement(menClothesPage.getSportswearButton());
        menClothesPage.moveToSportswearButton();
    }

    @And("User clicks on shorts category button")
    public void userClicksOnShortsCategoryButton(){
        menClothesPage.waitVisibilityOfElement(menClothesPage.getShortsCategoryButton());
        menClothesPage.clickOnShortsCategoryButton();
    }

    @And("User waiting for the shorts page to load")
    public void userWaitingForShortsPage(){
        shortsPage = pageFactoryManager.getShortsPage();
        shortsPage.waitForPageLoadComplete();
    }

    @And("User choose the shorts product")
    public void userChooseTheShortsProduct(){
        shortsPage.waitVisibilityOfElement(shortsPage.getShortsProduct());
        shortsPage.clickOnShortsProductButton();
    }

    @And("User choose the size in select size menu")
    public void userChooseSizeInSelectSizeMenu(){
        productPage.waitVisibilityOfListElements(productPage.getListOfSizes());
        productPage.selectSIzeInSelectSizeMenu(productPage.getListOfSizes());
    }

    @And("User checks that {string} of items changed")
    public void userChecksThatItemsAddedToCart(String number){
        productPage.waitVisibilityOfElement(productPage.getCartButton());
        Assert.assertEquals(productPage.getTextCartButton(), number);
    }

    @And("User moves mouse to cart button")
    public void userMovesMouseToCartButton(){
        productPage.waitVisibilityOfElement(productPage.getCartButton());
        productPage.moveToCartButton();
    }

    @And("User deletes item from cart")
    public void userDeletesItemFromCart(){
        productPage.waitVisibilityOfElement(productPage.getDeleteFromCart());
        productPage.deleteItemFromCart();
    }

    @And("User checks that cart is empty")
    public void userChecksThatCartIsEmpty(){
        productPage.waitVisibilityOfElement(productPage.getEmptyCart());
        Assert.assertTrue(productPage.emptyCartIsDisplayed());
    }
}


