package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenClothesPage extends BasePage {

    public MenClothesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@data-testid='primarynav-large' and not(@aria-hidden='true')]//button")
    private List<WebElement> listOfCategory;

    @FindBy(xpath = "//ul[contains(@aria-labelledby,'shop-by-product')]//a[contains(@href,'mw|sportswear')]")
    private List<WebElement> listOfSportwearCategory;

    public List<WebElement> getListOfSportwearCategory() {
        return listOfSportwearCategory;
    }

    public List<WebElement> getListOfCategory() {
        return listOfCategory;
    }

    public WebElement getlistOfSportwearCategoryByIndex(int index) {
        return listOfSportwearCategory.get(index);
    }

    public void clickOnSportwearCategory(int index) {
        getlistOfSportwearCategoryByIndex(index).click();
    }

    public WebElement getCategoryByIndex(int index) {
        return listOfCategory.get(index);
    }

    public void moveToCategory(int index) {
        actions.moveToElement(getCategoryByIndex(index)).build().perform();
    }
}
