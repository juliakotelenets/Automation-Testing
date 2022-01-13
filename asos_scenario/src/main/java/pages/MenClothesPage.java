package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenClothesPage extends BasePage {

    public MenClothesPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//button[@data-id='c51a4a82-3055-436d-8a41-6621fd7439aa']")
    private WebElement sportswearButton;

    @FindBy(xpath = "//a[@href='https://www.asos.com/men/activewear/shorts/cat/?cid=27178&nlid=mw|sportswear|shop+by+product|shorts']")
    private WebElement shortsCategoryButton;

    public void clickOnShortsCategoryButton(){shortsCategoryButton.click();}

    public WebElement getShortsCategoryButton(){return shortsCategoryButton;}

    public void moveToSportswearButton(){actions.moveToElement(sportswearButton).build().perform();}

    public WebElement getSportswearButton(){return sportswearButton;}
}
