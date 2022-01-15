package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//ul[@data-testid='social-links-bar']//li")
    private List<WebElement> networkLinks;

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

    public WebElement getNetworkLinksByIndex(int index){return networkLinks.get(index);}

    public boolean getNettworkLinksIsEnabledByIndex(int index){return getNetworkLinksByIndex(index).isEnabled();}

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
}
