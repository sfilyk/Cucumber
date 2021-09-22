package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//li[@class='gh-t']//a[text()='Sign in']")
    private WebElement signInButton;
    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }
    @FindBy(xpath = "//li[@class='gh-t']//a[text()='register']")
    private WebElement registerButton;
    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }
   
}