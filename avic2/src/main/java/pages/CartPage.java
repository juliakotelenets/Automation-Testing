package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement plusTheAmountOfProducts;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//i[@class='icon icon-close js-btn-close' and @data-cart-remove]")
    private WebElement deleteTheProduct;

    public void deleteTheProduct(){
        deleteTheProduct.click();
    }

    public void addTheProducts(){
        Actions actions = new Actions(driver);
        actions.moveToElement(plusTheAmountOfProducts).doubleClick(plusTheAmountOfProducts).build().perform();
    }

    public WebElement getAddToCartPopup(){
        return addToCartPopup;
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
