package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeelsPage extends BasePage {

    public HeelsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//article[@id='product-22566451']//a[@class='_3TqU78D']")
    private WebElement productHeel;

    @FindBy(xpath = "//article[@id='product-22566451']//div[@class='_3J74XsK']//h2")
    private WebElement nameOfProduct;

    public WebElement getNameOfProduct(){return nameOfProduct;}

    public String getTextNameOfProduct(){return nameOfProduct.getText();}

    public void clickOnProductHeelButton(){productHeel.click();}

    public WebElement getProductHeel(){return productHeel;}
}
