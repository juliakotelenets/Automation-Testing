package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeelsPage extends BasePage {

    public HeelsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']")
    private List<WebElement> listOfHeelsProducts;

    public List<WebElement> getListOfHeelsProducts(){return listOfHeelsProducts;}

    public WebElement getHeelsProductByIndex(int index){return listOfHeelsProducts.get(index);}

    public void clickOnHeelsProductByIndex(int index){getHeelsProductByIndex(index).click();}

    public String getTextOfProductByIndex(int index){return getHeelsProductByIndex(index).getText();}
}
