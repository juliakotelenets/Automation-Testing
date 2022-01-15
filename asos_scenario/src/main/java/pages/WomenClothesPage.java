package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WomenClothesPage extends BasePage {

    public WomenClothesPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//nav[@data-testid='primarynav-large' and not(@aria-hidden='true')]//button")
    private List<WebElement> category;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,'shop-by-product')]//a[contains(@href,'women/shoes/')]")
    private List<WebElement> listOfShoesCategoryProducts;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,'shop-by-product')]//a[contains(@href,'ww|clothing')]")
    private List<WebElement> listOfClothingCategoryProducts;

    public WebElement getClothingCategoryByIndex(int index){return listOfClothingCategoryProducts.get(index);}

    public void clickOnClothingCategoryByIndex(int index){getClothingCategoryByIndex(index).click();}

    public WebElement getShoesCategoryByIndex(int index){return listOfShoesCategoryProducts.get(index);}

    public void clickOnShoesCategoryByIndex(int index){getShoesCategoryByIndex(index).click();}

    public WebElement getCategoryByIndex(int index){return category.get(index);}

    public List<WebElement> getCategory(){return category;}

    public void moveToCategoryByIndex(int index){actions.moveToElement(getCategoryByIndex(index)).build().perform();}

    public List<WebElement> getListOfShoesCategoryProducts(){return listOfShoesCategoryProducts;}
}
