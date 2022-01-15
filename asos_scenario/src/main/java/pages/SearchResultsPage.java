package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//div[@id='search-term-banner']//p[@class='vp-JnyG']")
    private WebElement titleOfSearchHeels;

    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']")
    private List<WebElement> hoodiesProduct;

    public WebElement getHoodieProductByIndex(int index){return hoodiesProduct.get(index);}

    public void clickOnHoodieProduct(int index){getHoodieProductByIndex(index).click();}

    public String getTextTitleSearchHeels(){return titleOfSearchHeels.getText();}

    public WebElement getTitleOfSearchHeels(){return titleOfSearchHeels;}
}
