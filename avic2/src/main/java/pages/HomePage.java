package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='page-title' and contains(text(),'Популярні товари')]")
    private WebElement title;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/channel/UCeDZJkBQu8KMn3OPoU71HvA/featured']")
    private WebElement youtubeButton;

    @FindBy(xpath = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']/div[@class='active-cart-item js_cart_count']")
    private WebElement productsInCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword){
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public String getTextOfTitle(){
        return title.getText();
    }

    public String getTextOfProductsInCart(){
        return productsInCart.getText();
    }

    public WebElement getYoutubeButton(){
        return youtubeButton;
    }


}
