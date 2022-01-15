package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public final long DEFAULT_TIME_TO_WAIT = 80;
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, DEFAULT_TIME_TO_WAIT);
        PageFactory.initElements(driver, this);
    }

    public void waitVisibilityOfElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitVisibilityOfListElements(List<WebElement> elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitTextToBePresented(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitForPageLoadComplete(){
        wait.until(webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitElementToBeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
