package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//a[@href='#electronics']")
    private WebElement electronicsButton;
    public WebElement isElectronicsButtonVisible() {
        return electronicsButton;
    }
    public void clickElectronicsButton() {
        electronicsButton.click();
    }
    
    @FindBy(xpath = "//a[@title='Laptops & Netbooks']")
    private WebElement laptopsButton;
    public void clickLaptopsButton() {
        laptopsButton.click();
    }
    
    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    private WebElement contentToVisibleAddToCart;
    public boolean getContentToVisibleAddToCart() {
        return contentToVisibleAddToCart.isDisplayed();
    }
    
    @FindBy(xpath = "//div[@class='s-item__image-wrapper']")
    private WebElement product;
    public void clickProduct() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", product);
    }
    public WebElement isProductVisible() {
        return product;
    }
    
    @FindBy(xpath = "//a[@role='button'] [@id='isCartBtn_btn']")
    private WebElement productVisible;
    public WebElement isProductVisibleAddToCart() {
        return productVisible;
    }
    public void clickProductAddToCart() {
        productVisible.click();
    }
    
    @FindBy(xpath = "//div[@class='item-action']//div[@class='app-atc ']")
    private WebElement productAdd;
    public void clickProductAddToCart2() {
        productAdd.click();
    }
    
    @FindBy(xpath = "//i[@id='gh-cart-n']")
    private WebElement productsCount;
    public WebElement getListProductsCount() {
        return productsCount;
    }
    public String getAmountOfProducts() {
        return productsCount.getText();
    }
    
    
}
