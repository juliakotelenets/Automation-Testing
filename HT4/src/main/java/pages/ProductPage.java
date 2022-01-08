package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@class='product-slider__page-item' and @for='product-slider_id_2']")
    private WebElement secondImage;

    @FindBy(xpath = "//div[@class='product-slider__item sl__i']/following-sibling::div/child::img")
    private WebElement bigImage;

    @FindBy(xpath = "//span[@itemprop='price' and @class='price_item']")
    private WebElement productPrice;

    @FindBy(xpath = "//div[@class='product-item__button']/child::div")
    private WebElement buyButton;

    @FindBy(xpath = "//div[@class='product__button-increase']")
    private WebElement addProduct;

    @FindBy(xpath = "//div[@class='product__price-column']/div[@class='product__price']")
    private WebElement priceInCart;

    public void slideThePhotos(){ secondImage.click(); }

    public boolean isBigImageDisplayed(){ return bigImage.isDisplayed(); }

    public String getTextProductPrice(){ return productPrice.getText(); }

    public void clickOnBuyButton(){ buyButton.click(); }

    public WebElement getBuyButton(){ return buyButton; }

    public void clickOnAddProductButton(){ addProduct.click();  }

    public WebElement getAddProduct(){ return addProduct; }

    public String getTextFromPriceInCart(){ return priceInCart.getText(); }

    public WebElement getPriceInCart(){return  priceInCart;}

    public WebElement getSecondImage(){ return secondImage; }
}
