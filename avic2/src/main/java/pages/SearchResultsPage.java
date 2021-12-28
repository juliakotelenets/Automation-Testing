package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox' and @name='filters[categories][]' and @id='fltr-category-1029']/following-sibling::label")
    private WebElement filter;

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private WebElement buyButton;


    public void filterTheProducts(){
        filter.click();
    }

    public void buyTheProduct(){
        buyButton.click();
    }

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
}
