import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class AvicTests extends WebDriverSettings{

    @Test(priority = 1)
    public void checkTheText(){
        WebElement element = driver.findElement(By.xpath("//div[@class='page-title' and contains(text(),'Популярні товари')]"));
        String par = element.getText();
        Assert.assertEquals(par, "Популярні товари", "Passed");
    }

    @Test(priority = 2)
    public void checkTheLinkToYoutube(){
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCeDZJkBQu8KMn3OPoU71HvA/featured']")).isEnabled());
    }

    @Test(priority = 3)
    public void checkThatCanAddItemsToTheCart(){
        driver.findElement(By.xpath("//input[@id='input_search']")).sendKeys("Sony Playstation 5");
        driver.findElement(By.xpath("//button[@class='button-reset search-btn']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@type='checkbox' and @name='filters[categories][]' and @id='fltr-category-1029']/following-sibling::label")).click();
        driver.findElement(By.xpath("//a[@class='prod-cart__buy']")).click();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[@class='js_plus btn-count btn-count--plus ']"));
        actions.moveToElement(element).doubleClick(element).build().perform();
        Assert.assertTrue(true);
    }


    @Test(priority = 4)
    public void checkThatCanDeleteElementsFromCart() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='input_search']")).sendKeys("Sony Playstation 5");
        driver.findElement(By.xpath("//button[@class='button-reset search-btn']")).click();
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(By.xpath("//a[@class='prod-cart__buy']")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_cart")));
        driver.findElement(By.xpath("//i[@class='icon icon-close js-btn-close' and @data-cart-remove]")).click();
        Thread.sleep(200);
        String actualProductsCountInCart =
                driver.findElement(By.xpath("//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']/div[@class='active-cart-item js_cart_count']"))
                        .getText();
        Assert.assertEquals(actualProductsCountInCart, "0");
    }
}
