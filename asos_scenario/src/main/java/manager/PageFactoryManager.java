package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) { this.driver = driver; }

    public HomePage getHomePage() { return new HomePage(driver); }

    public WomenClothesPage getWomenClothesPage(){return new WomenClothesPage(driver);}

    public HeelsPage getHeelsPage(){return new HeelsPage(driver);}

    public WishListPage getWishListPage(){return new WishListPage(driver);}

    public ProductPage getProductPage(){return new ProductPage(driver);}

    public RegisterPage getRegisterPage(){return new RegisterPage(driver);}

    public SearchResultsPage getSearchResultsPage(){return new SearchResultsPage(driver);}

    public DressesPage getDressesPage(){return new DressesPage(driver);}

    public MenClothesPage getMenClothesPage(){return new MenClothesPage(driver);}

    public ShortsPage getShortsPage(){return new ShortsPage(driver);}
}
