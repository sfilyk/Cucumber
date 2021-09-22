package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

  
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(xpath = "//div[@class='font-title-3']")
    private WebElement textCartPageVisible;
    public String isTextCartPageVisible() {
        return textCartPageVisible.getText();
    }
    public WebElement getTextVisible() {
        return textCartPageVisible;
    }
    
    @FindBy(xpath = "//button[@data-test-id='cart-remove-item']")
    private WebElement productAddAndRemove;
    public void clickRemoveProduct() {
        productAddAndRemove.click();
    }
    public WebElement getRemoveProductVisible() {
        return productAddAndRemove;
    }
}
