package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import pages.*;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {
    
    private static final long DEFAULT_WAITING_TIME = 30;
    WebDriver driver;
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    SearchPage searchPage;
    ProductPage productPage;
    PageFactoryManager pageFactoryManager;
    AccountPage accountPage;
    DailyDealsPage dailyDealsPage;
    
    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }
    
    @After
    public void tearDown() {
        driver.close();
    }
    
    @Given("User opens {string} page")
    public void openHomePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }
    
    @And("User checks search field visibility")
    public void userChecksSearchFieldVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        searchPage = pageFactoryManager.getSearchPage();
        searchPage.isSearchFieldVisible();
    }
    
    @When("User makes search by keyword {string}")
    public void userMakesSearchByKeywordKeyword(final String keyword) {
        searchPage.enterTextToSearchField(keyword);
    }
    
    @And("User clicks search button")
    public void clicksSearchButton() {
        searchPage.clickSearchButton();
    }
    
    @And("User checks first product visibility")
    public void checksFirstProductVisibility() {
        homePage.waitForPageLoadComplete(60);
        productPage = pageFactoryManager.getProductPage();
        productPage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, productPage.isProductVisible());
    }
    
    @And("User clicks on first product")
    public void clicksOnFirstProduct() {
        productPage.clickProduct();
    }
    
    @And("User checks 'Add to Cart' visibility button")
    public void checksAddToCartVisibilityButton() {
        productPage.waitVisibilityOfElement(10, productPage.isProductVisibleAddToCart());
        assertTrue(productPage.getContentToVisibleAddToCart());
    }
    
    @And("User clicks 'Add to Cart' button")
    public void clicksAddToCartButton() {
        productPage.clickProductAddToCart();
    }
    
    @Then("User checks that add to cart popup header is {string}")
    public void checksThatAddToCartPopupHeaderIsHeader(final String expectedAmount) {
        productPage.waitVisibilityOfElement(60, productPage.getListProductsCount());
        assertEquals(productPage.getAmountOfProducts(), expectedAmount);
    }
    
    @And("User clicks 'Home Page' button")
    public void userClicksHomePageButton() {
        homePage.clickBackToHomePage();
    }
    
    @And("User clicks button 'Shop by category'")
    public void userClicksButtonShopByCategory() {
        homePage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, homePage.isMenuButtonVisible());
        homePage.clickMenuButton();
    }
    
    @And("User checks 'Drop-down'  menu  'Shop by category'")
    public void userChecksDropDownMenuShopByCategory() {
        homePage.clickMenuCategoriesSeeAllButton();
    }
    
    @And("User clicks 'See all categories' button")
    public void userClicksSeeAllCategoriesButton() {
        productPage = pageFactoryManager.getProductPage();
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        productPage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, productPage.isElectronicsButtonVisible());
        productPage.clickElectronicsButton();
        
    }
    
    @When("User clicks 'Laptops & Netbooks' button")
    public void userClicksLaptopsNetbooksButton() {
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        productPage.clickLaptopsButton();
    }
    
    @And("User clicks 'Add to Cart2' button")
    public void userClicksAddToCartButton() {
        productPage.clickProductAddToCart2();
    }
    
    @And("User checks header visibility")
    public void userChecksHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        homePage.isHeaderVisible();
    }
    
    @And("User checks menu visibility")
    public void userChecksMenuVisibility() {
        homePage.isMenuVisible();
    }
    
    @And("User checks top carouse visibility")
    public void userChecksTopCarouseVisibility() {
        homePage.isTopCarouselVisible();
    }
    
    @And("User checks bottom carouse visibility")
    public void userChecksBottomCarouseVisibility() {
        homePage.isBottomCarouselVisible();
    }
    
    @And("User checks notification icon visibility")
    public void userChecksNotificationIconVisibility() {
        homePage.isNotificationIconVisible();
    }
    
    @And("User checks 'Drop-down' menu button visibility")
    public void userChecksDropDownMenuButtonVisibility() {
        homePage.isMenuButtonVisible();
    }
    
    @And("User checks cart icon visibility")
    public void userChecksCartIconVisibility() {
        homePage.isCartIconVisible();
    }
    
    @And("User checks help and contact button visibility")
    public void userChecksHelpAndContactButtonVisibility() {
        homePage.isHelpAndContactButtonVisible();
    }
    
    @And("User checks ship to button visibility")
    public void userChecksShipToButtonVisibility() {
        homePage.isShipToButtonVisible();
    }
    
    @And("User checks ship to popup visible")
    public void userChecksShipToPopupVisible() {
        homePage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, homePage.isShipToPopupVisible());
    }
    
    @Then("User closes ship to popup")
    public void userClosesShipToPopup() {
        homePage.clickShipToPopupCloseButton();
    }
    
    @When("User clicks 'Ship to' button")
    public void userClicksShipToButton() {
        homePage.clickShipToButton();
    }
    
    @And("User checks register button visibility")
    public void userChecksRegisterButtonVisibility() {
        homePage.clickNavigationTop();
        accountPage = pageFactoryManager.getAccountPage();
        accountPage.isRegisterButtonVisible();
    }
    
    @And("User checks sign in button visibility")
    public void userChecksSignInButtonVisibility() {
        accountPage.isSignInButtonVisible();
    }
    
    @When("User clicks Help and contact button")
    public void userClicksHelpAndContactButton() {
        homePage.clickHelpAndContactButton();
        
    }
    
    @And("User checks visibility Customer Service page")
    public void userChecksVisibilityPageCustomerService() {
        assertTrue(homePage.getHelpText());
    }
    
    @And("User clicks Buying button")
    public void userClicksBuyingButton() {
        homePage.clickBuyingButton();
    }
    
    @And("User checks visibility page, and return help page")
    public void userChecksVisibilityBuyingPage() {
        assertTrue(homePage.getH1Text());
        homePage.clickHelpAndContactButton();
    }
    
    @And("User clicks Selling button")
    public void userClicksSellingButton() {
        homePage.clickSellingButton();
    }
    
    @And("User clicks Account button")
    public void userClicksAccountButton() {
        homePage.clickAccountButton();
    }
    
    @And("User clicks Returns & Refunds button")
    public void userClicksReturnsRefundsButton() {
        homePage.clickReturnsRefundsButton();
    }
    
    @And("User clicks Shipping & Tracking button")
    public void userClicksShippingTrackingButton() {
        homePage.clickShipTrackButton();
    }
    
    @And("User clicks Fees & billing button")
    public void userClicksFeesBillingButton() {
        homePage.clickFeesBillingButton();
    }
    
    @When("User clicks Daily Deals button")
    public void userClicksDailyDealsButton() {
        homePage.clickDailyDealsButton();
    }
    
    @And("User checks Daily Deals visibility")
    public void userChecksDailyDealsVisibility() {
        dailyDealsPage = pageFactoryManager.getDailyDealsPage();
        dailyDealsPage.isDailyDealsVisible();
    }
    
    @Then("The user then verifies that the offer list has the value {string}")
    public void ValueAmountOfProducts(final String expectedAmount) {
        dailyDealsPage.getElementsListCount();
    }
    
    @Then("User checks whether the search {string} matches")
    public void resultMatches(final String expectedText) {
        assertEquals(searchPage.isTextVisible(), expectedText);
    }
    
    @Then("User checks to see if the search matches the wrong {string} word")
    public void userChecksToSeeIfTheSearchMatchesTheWrongResultWord(final String expectedText) {
        assertEquals(searchPage.isTextIncorrectVisible(), expectedText);
    }
    @Then("The user checks to see if the search matches the wrong word")
    public void theUserChecksToSeeIfTheSearchMatchesTheWrongWordHeader() {
        assertTrue(searchPage.isTextIncorrectVisible());
    }
    
    @And("User clicks icon shopping cart")
    public void userClicksIconShoppingCart() {
        homePage.clickCartIcon();
    }
    
    @Then("User checks to see if the empty shopping cart {string}")
    public void userChecksToSeeIfTheEmptyShoppingCartHeader(final String expectedText) {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        assertEquals(shoppingCartPage.isTextCartPageVisible(), expectedText);
    }
    
    @And("User performs a second search for the keyword {string}")
    public void userPerformsASecondSearchForTheKeywordKeyword(final String keyword) {
        searchPage.enterTextToSearchField(keyword);
    }
    
    @And("User clicks remove 'Remove' button")
    public void userClicksRemoveButton() {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, shoppingCartPage.getRemoveProductVisible());
        shoppingCartPage.clickRemoveProduct();
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_WAITING_TIME, shoppingCartPage.getTextVisible());
        
    }
}