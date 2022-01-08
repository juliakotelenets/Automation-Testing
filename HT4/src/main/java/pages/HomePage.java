package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/categorys/3/' and contains(text(),'Парфюмерия')]")
    private WebElement headline;

    @FindBy(xpath = "//input[@id='search-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@href='/categorys/2419/']")
    private WebElement makeupCategory;

    @FindBy(xpath = "//label[@for='m67']")
    private WebElement eyes;

    @FindBy(xpath = "//a[@href='/categorys/23466/']")
    private WebElement mascara;

    @FindBy(xpath = "//a[@href='/categorys/20272/']")
    private WebElement hairCategory;

    @FindBy(xpath = "//a[@href='/categorys/22806/']")
    private WebElement shampooProducts;

    public void fillSearchField(){ searchInput.sendKeys(headline.getText()); }

    public void clickOnSearchButton(){ searchButton.click(); }

    public WebElement getSearchButton(){ return searchButton; }

    public void moveToMakeupCategory(){ actions.moveToElement(makeupCategory).build().perform(); }

    public void clickOnEyesButton(){ eyes.click(); }

    public WebElement getEyes(){ return eyes; }

    public void clickOnMascaraButton(){ mascara.click(); }

    public WebElement getMascara(){ return mascara; }

    public void moveToHairCategory(){ actions.moveToElement(hairCategory).build().perform(); }

    public void clickOnShampooProduct(){ shampooProducts.click(); }

    public WebElement getShampooProducts(){ return shampooProducts; }
}
