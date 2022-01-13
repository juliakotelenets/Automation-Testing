package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShortsPage extends BasePage {

    public ShortsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//a[@href='https://www.asos.com/reebok/reebok-training-workout-ready-2-in-1-shorts-in-black/prd/200957937?colourWayId=200957938&cid=27178']")
    private WebElement shortsProduct;

    public void clickOnShortsProductButton(){shortsProduct.click();}

    public WebElement getShortsProduct(){return shortsProduct;}
}
