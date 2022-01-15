package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//button[@class='i5hAj _5AuCN']")
    private WebElement addToWishList;

    @FindBy(xpath = "//a[contains(@href,'saved-lists')]")
    private WebElement wishList;

    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement selectSizeButton;

    @FindBy(xpath = "//select[@data-id='sizeSelect']//option")
    private List<WebElement> listOfSizes;

    @FindBy(xpath = "//span[text()='Add to bag']")
    private WebElement buyButton;

    @FindBy(xpath = "//span[@id='selectSizeError']")
    private WebElement selectSizeError;

    @FindBy(xpath = "//span[@class='_1z5n7CN']")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@aria-label='Delete this item']")
    private WebElement deleteFromCart;

    @FindBy(xpath = "//a[@aria-label='Bag 0 items']")
    private WebElement emptyCart;

    public WebElement getEmptyCart(){return emptyCart;}

    public boolean emptyCartIsDisplayed(){return emptyCart.isDisplayed();}

    public void deleteItemFromCart(){deleteFromCart.click();}

    public WebElement getDeleteFromCart(){return deleteFromCart;}

    public String getTextCartButton(){return cartButton.getText();}

    public WebElement getCartButton(){return cartButton;}

    public void moveToCartButton(){actions.moveToElement(cartButton).build().perform();}

    public WebElement getSelectSizeError(){return selectSizeError;}

    public boolean selectSizeErrorIsDisplayed(){return selectSizeError.isDisplayed();}

    public void clickOnBuyButton(){buyButton.click();}

    public WebElement getBuyButton(){return buyButton;}

    public List<WebElement> getListOfSizes(){return listOfSizes;}

    public WebElement getSizeByIndex(int index){return listOfSizes.get(index);}

    public List<String> getSizesString(WebElement sizes){ return Arrays.asList(sizes.getText().split("\n")); }

    public boolean verifyThatSizeEqualsExpected(List<String> sizes, String size){
        boolean result = false;
        if (sizes.get(0).equals(size)) {
            result = true;
        }
        return result;
    }

    public WebElement getSelectSizeButton(){return selectSizeButton;}

    public void selectSIzeInSelectSizeMenu(List<WebElement> sizes, int index){sizes.get(index).click();}

    public void clickOnSelectSizeButton(){selectSizeButton.click();}

    public void clickOnWishList(){wishList.click();}

    public void clickAddToWishList(){addToWishList.click();}

    public WebElement getAddToWishList(){return addToWishList;}
}
