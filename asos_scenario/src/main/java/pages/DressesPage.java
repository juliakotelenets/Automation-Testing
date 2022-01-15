package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DressesPage extends BasePage {

    public DressesPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//li[@data-dropdown-id='size_eu']//button")
    private WebElement sizeButton;

    @FindBy(xpath = "//li[@class='_3LB03xF']//div//div")
    private List<WebElement> listOfSizes;

    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']")
    private List<WebElement> listOfDressesProducts;

    public WebElement getDressProductByIndex(int index){return listOfDressesProducts.get(index);}

    public void clickOnDressProductByIndex(int index){getDressProductByIndex(index).click();}

    public List<WebElement> getListOfDressesProducts() {
        return listOfDressesProducts;
    }

    public WebElement getSizeByIndex(int index){return listOfSizes.get(index);}

    public void clickOnSizeByIndex(int index){getSizeByIndex(index).click();}

    public void clickOnSizeButton(){sizeButton.click();}
}
