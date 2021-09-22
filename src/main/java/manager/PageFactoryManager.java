package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;
    
    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    
    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    
    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(driver);
    }
    
    public SearchPage getSearchPage() {
        return new SearchPage(driver);
    }
    
    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }
   
    public AccountPage getAccountPage() {
        return new AccountPage(driver);
    }
    
    public DailyDealsPage getDailyDealsPage() {
        return new DailyDealsPage(driver);
    }
}
