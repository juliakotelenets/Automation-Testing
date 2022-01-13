package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenClothesPage extends BasePage {

    public WomenClothesPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//span[text()='Shoes']")
    private WebElement shoesButton;

    @FindBy(xpath = "//a[text()='Heels']")
    private WebElement heelsButton;

    @FindBy(xpath = "//button[@data-id='96b432e3-d374-4293-8145-b00772447cde']")
    private WebElement clothingButton;

    @FindBy(xpath = "//li[@class='_1g1PWkA _2SQx27S']//a[text()='Dresses']")
    private WebElement dressesCategory;

    public WebElement getDressesCategory(){return dressesCategory;}

    public void clickOnDressesCategory(){dressesCategory.click();}

    public WebElement getClothingButton(){return clothingButton;}

    public void moveToClothingButton(){actions.moveToElement(clothingButton).build().perform();}

    public void moveToShoesButton(){ actions.moveToElement(shoesButton).build().perform(); }

    public WebElement getShoesButton(){return shoesButton;}

    public void clickOnHeelsButton(){heelsButton.click();}

    public WebElement getHeelsButton(){return heelsButton;}
}
