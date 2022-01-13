package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//a[@href='https://www.facebook.com/ASOS/']")
    private WebElement facebookButton;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/asos/']")
    private WebElement instagramButton;

    @FindBy(xpath = "//a[@href='https://www.snapchat.com/add/asosfashion']")
    private WebElement snapchatButton;

    @FindBy(xpath = "//a[@href='https://www.asos.com/women/']")
    private WebElement womenClothesButton;

    @FindBy(xpath = "//div[@id='myAccountDropdown']//button[@type='button']")
    private WebElement accountButton;

    @FindBy(xpath = "//a[@data-testid='signup-link']")
    private WebElement signUpButton;

    @FindBy(id = "chrome-search")
    private WebElement searchInputField;

    @FindBy(xpath = "//a[@id='men-floor']")
    private WebElement menClothesButton;

    public void clickOnMenClothesButton(){menClothesButton.click();}

    public WebElement getMenClothesButton(){return menClothesButton;}

    public WebElement getSearchInputField(){return searchInputField;}

    public void fillTheSearchInputField(String input){searchInputField.sendKeys(input, Keys.ENTER);}

    public WebElement getSignUpButton(){return signUpButton;}

    public void clickOnSignUp(){signUpButton.click();}

    public void moveToAccountButton(){actions.moveToElement(accountButton).build().perform();}

    public WebElement getAccountButton(){return accountButton;}

    public void openHomePage(String url) { driver.get(url); }

    public void clickOnWomenClothesButton(){womenClothesButton.click();}

    public WebElement getWomenClothesButton(){return womenClothesButton;}

    public boolean checkThatButtonIsEnabled(WebElement element){
        boolean result = false;
        if (element.isEnabled()) result = true;
        return result;
    }

    public WebElement getFacebookButton(){return facebookButton;}

    public WebElement getInstagramButton(){return instagramButton;}

    public WebElement getSnapchatButton(){return snapchatButton;}
}
