package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//div[@id='search-term-banner']//p[@class='vp-JnyG']")
    private WebElement titleOfSearchHeels;

    @FindBy(xpath = "//article[@id='product-200496646']//a[@class='_3TqU78D']")
    private WebElement hoodieProduct;

    public void clickOnHoodieProduct(){hoodieProduct.click();}

    public WebElement getHoodieProduct(){return hoodieProduct;}

    public String getTextTitleSearchHeels(){return titleOfSearchHeels.getText();}

    public WebElement getTitleOfSearchHeels(){return titleOfSearchHeels;}
}
