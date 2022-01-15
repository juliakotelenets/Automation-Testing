package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShortsPage extends BasePage {

    public ShortsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']")
    private List<WebElement> shortsProduct;

    public WebElement getShortProductByIndex(int index){return shortsProduct.get(index);}

    public void clickOnShortProductByIndex(int index){getShortProductByIndex(index).click();}
}
