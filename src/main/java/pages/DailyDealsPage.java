package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DailyDealsPage extends BasePage{
    public DailyDealsPage(WebDriver driver) {
        super(driver);
    }
    
    
    @FindBy(xpath = "//div[@class='ebayui-dne-banner-text']")
    private WebElement dailyDealsVisible;
    public WebElement isDailyDealsVisible() {
        return dailyDealsVisible;
    }
    
    @FindBy(xpath = "//div[@class='slashui-image-cntr']")
    private List<WebElement> elementsList;
    public long getElementsListCount() {
        return elementsList.stream().count();
    }
}
