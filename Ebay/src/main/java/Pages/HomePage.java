package Pages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;
public class HomePage extends CommonAPI {
    @FindBy(xpath = "//div[@id='gh-ac-box2']")
    WebElement searchBox;
    @FindBy(id = "gh-btn")
    WebElement searchButton;
    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']//li[@class='hl-cat-nav__js-tab']/a[contains(text(),'Motors')]")
    WebElement motors;
    @FindBy(xpath = "//*[@class='gh-cart-icon']")
    WebElement shoppingCart;
    @FindBy(xpath = "//a[contains(text(),'Start shopping')]")
    WebElement startShopping;
    @FindBy(id = "gh-shop-ei")
    WebElement shopByCategory;
    @FindBy(id = "gh-Alerts-i")
    WebElement notification;
    @FindBy(xpath = "//select[@class='gh-sb ']")
    WebElement allCategories;
    @FindBy(xpath = "//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[4]/a[1] ")
    WebElement fashion;
    @FindBy(xpath = "//span[@class='b-pageheader__text']")
    WebElement fashionText;
    @FindBy(xpath = " //li[@id='gh-eb-Alerts']//a[1]")
    WebElement notificationAlert;
    @FindBy(xpath = "//img[@id='gh-logo']")
    WebElement logo;
    @FindBy(xpath ="//li[@class='gf-li']//li[1]//a[1]")
    WebElement eBayArgentina;
    public void searchItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions ac = new Actions(driver);
        ac.moveToElement(searchBox).click().build().perform();
        ac.moveToElement(searchBox).sendKeys("pencil").build().perform();
        searchButton.click();
    }
    public void getEbaySites() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHover(" //b[@id='gf-fbtn-arr']");
        Thread.sleep(3000);
    }
    public void clickEbaySites() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverClickWebElement(" //b[@id='gf-fbtn-arr']");
        eBayArgentina.click();
        Thread.sleep(3000);
    }
    public void notificaton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        notification.click();
    }
    public void shopByCategory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategory.click();
    }
    public void mouseOverElement() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHover("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[3]/a[1]");
        Thread.sleep(3000);
    }
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fashion.click();
        fashionText.getText();
    }
    public void shoppingCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shoppingCart.click();
        startShopping.click();
    }
    public void logoIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.isDisplayed();
        mouseHoverClickWebElement("//img[@id='gh-logo']");
    }
    public void getMotorsOptionsPartsAndAccessories() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseOverElement();
        List<WebElement> partsAndAccessories = driver.findElements(By.xpath("//div[@class='hl-cat-nav']//li[3]//div[2]//div[1]//div[1]//a"));
        for (WebElement e : partsAndAccessories) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void getFashionTopCategories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHover("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[4]/a[1]");
        Thread.sleep(3000);
        List<WebElement> topCategories = driver.findElements(By.xpath("//div[@class='hl-cat-nav']//li[4]//div[2]//div[1]//div[1]//a"));
        for (WebElement e : topCategories) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void slideShowImageFeaturedItemsHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
        mouseHover("//div[@class='srp-controls--selected-value']");
    }
    public void chooseRadioButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
        mouseHoverClickWebElement("//ul[@class='x-refine__main__value']//input[@data-value='1 Day Shipping']");
    }
   public void slideShowImageFeaturedItemsSelect(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
        mouseHover("//div[@class='srp-controls--selected-value']");
        mouseHoverClickWebElement("//div[@id='w8-w0-w1']//*[@class='svg-icon x-flyout-arrow-down']");
    }
    public MotosPage goToMotorsPage() {
        motors.click();
        return new MotosPage(driver);
    }
    public void selectCategoryItem(String value) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allCategories.click();
        selectElementByText(allCategories, value);
        Thread.sleep(3000);
    }
    public void selectCategoryItemBaby(String value)throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allCategories.click();
        selectElementByText(allCategories, value);
        Thread.sleep(3000);
    }
    public void textFromSlideShowImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions ac = new Actions(driver);
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
    }
    public void slideShowImageViewHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
        mouseHover("//div[@id='w8-w0-w2']//*[@class='svg-icon x-flyout-arrow-down']");
    }
    public void getAllCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allCategories.click();
        List<WebElement> allCategoryItem = driver.findElements(By.xpath("//div[@id='gh-cat-box']/select//option"));
        for (WebElement e : allCategoryItem) {
            System.out.println(e.getText());
        }
}
public void choosePriceRange() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//span[contains(text(),'All Things Apple, Now Within Reach')]")).click();
        scrollDown("//input[@aria-label='Minimum Value']");
        driver.findElement(By.xpath("//input[@aria-label='Minimum Value']")).sendKeys("77");
        driver.findElement(By.xpath("//input[@aria-label='Maximum Value']")).sendKeys("800");
    }
}