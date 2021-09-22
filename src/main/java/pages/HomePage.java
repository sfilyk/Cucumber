package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openHomePage(String url) {
        driver.get(url);}
    
    @FindBy(xpath = "//header")
    private WebElement header;
    public void isHeaderVisible() {
        header.isDisplayed();
    }
    
    @FindBy(xpath = "//ul [@class='hl-cat-nav__container']")
    private WebElement menu;
    public void isMenuVisible() {
        menu.isDisplayed();
    }
    
    @FindBy(xpath = "//ul[contains(@id,'[0]')]")
    private WebElement topCarouselListVisible;
    public void isTopCarouselVisible() {
        topCarouselListVisible.isDisplayed();
    }
    
    @FindBy(xpath = "//ul[contains(@id,'[2]')]")
    private WebElement bottomCarouselListVisible;
    public void isBottomCarouselVisible() {
        bottomCarouselListVisible.isDisplayed();
    }
    
    @FindBy(xpath = "//a[@aria-label='Your shopping cart']")
    private WebElement cartIcon;
    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }
    public void clickCartIcon() {
        cartIcon.click();}
    
    @FindBy(xpath = "//li[@id='gh-eb-Alerts']")
    private WebElement notificationIcon;
    public void isNotificationIconVisible() {
        notificationIcon.isDisplayed();
    }
    
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    private WebElement menuButton;
  
    public WebElement isMenuButtonVisible() {
        return menuButton;
    }
    public void clickMenuButton() {
        menuButton.click();
    }
    
    @FindBy(xpath = "//i[@class='gh-sbc-h3i gh-sprRetina']")
    private WebElement menuCategoriesSeeAllButton;
    public void clickMenuCategoriesSeeAllButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuCategoriesSeeAllButton);
    }
    
    @FindBy(xpath = "//a[@href='https://ocsnext.ebay.com/ocs/home']")
    private WebElement helpAndContactButton;
    public void isHelpAndContactButtonVisible() {
        helpAndContactButton.isDisplayed();
    }
    public void clickHelpAndContactButton() {
        helpAndContactButton.click();
    }
    
    @FindBy(xpath = "//button [@_sp='m570.l46241']")
    private WebElement shipToButton;
    public void isShipToButtonVisible() {
        shipToButton.isDisplayed();
    }
    public void clickShipToButton() {
        shipToButton.click();
    }
    
    @FindBy(xpath = "//div[@class='gh-sublayer gh-modal__menu keyboard-trap--active']")
    private WebElement shipToPopupVisible;
    public WebElement isShipToPopupVisible() {
        return shipToPopupVisible;
    }
    
    @FindBy(xpath = "//button[@class='shipto__close-btn']")
    private WebElement shipToPopupCloseButton;
    public void clickShipToPopupCloseButton() {
        shipToPopupCloseButton.click();
    }
    
    @FindBy(xpath = "//a[@href='https://www.ebay.com/']")
    private WebElement backToHomePage;
    public void clickBackToHomePage() {
        backToHomePage.click();
    }
    
    @FindBy(xpath = "//div [@id='gh-top']")
    private WebElement navigationTop;
    public void clickNavigationTop() {
        navigationTop.click();
    }
    
    @FindBy(xpath = "//span[@class='buying']")
    private WebElement buyingButton;
    public void clickBuyingButton() {
        buyingButton.click();
    }
    
    @FindBy(xpath = "//span[@class='selling']")
    private WebElement sellingButton;
    public void clickSellingButton() {
        sellingButton.click();
    }
    
    @FindBy(xpath = "//span[@class='account']")
    private WebElement accountButton;
    public void clickAccountButton() {
        accountButton.click();
    }
    
    @FindBy(xpath = "//span[@class='returns-refunds']")
    private WebElement returnsRefundsButton;
    public void clickReturnsRefundsButton() {
        returnsRefundsButton.click();
    }
    
    @FindBy(xpath = "//span[@class='ship-track']")
    private WebElement shipTrackButton;
    public void clickShipTrackButton() {
        shipTrackButton.click();
    }
    
    @FindBy(xpath = "//span[@class='fees-billing']")
    private WebElement feesBillingButton;
    public void clickFeesBillingButton() {
        feesBillingButton.click();}
    
    @FindBy(xpath = "//td[@id='gh-title']")
    private WebElement helpText;
    public boolean getHelpText() {
    return helpText.isDisplayed();}
    
    @FindBy(xpath = "//*[@class='h1']")
    private WebElement h1Text;
    public boolean getH1Text() {
        return h1Text.isDisplayed();}
    
    @FindBy(xpath = "//li[@id='gh-p-1']")
    private WebElement dailyDealsButton;
    public void clickDailyDealsButton() {
        dailyDealsButton.click();}
    
    }
