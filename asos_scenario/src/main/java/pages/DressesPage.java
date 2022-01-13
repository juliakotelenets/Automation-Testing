package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends BasePage {

    public DressesPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//article[@id='product-23008622']//a[@class='_3TqU78D']")
    private WebElement dressProduct;

    @FindBy(xpath = "//li[@data-dropdown-id='size_eu']//button")
    private WebElement sizeButton;

    @FindBy(xpath = "//label[@for='size_eu_15871']//div")
    private WebElement UK16Size;

    public void clickOn16Size(){UK16Size.click();}

    public void clickOnSizeButton(){sizeButton.click();}

    public void clickOnDressProductPage(){dressProduct.click();}

    public WebElement getDressProduct(){return dressProduct;}
}
