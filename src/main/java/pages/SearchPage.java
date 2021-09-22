package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//input [@type='text']")
    private WebElement searchField;
    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }
    
    @FindBy(xpath = "//input[@id='gh-btn']")
    private WebElement searchButton;
    public void clickSearchButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
    }
    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }
    
    @FindBy(xpath = "//h1//span[2][@class='BOLD']")
    private WebElement textVisible;
    public String isTextVisible() {
        return textVisible.getText();
    }
    
    @FindBy(xpath = "//div[@class='s-message__content']")
    private WebElement textIncorrectVisible;
    public boolean isTextIncorrectVisible() {
                return textIncorrectVisible.isDisplayed();}
   }
