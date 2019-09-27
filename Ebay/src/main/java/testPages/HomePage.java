package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//div[@id='gh-ac-box2']")
    WebElement searchBox;
    @FindBy(id = "gh-btn")
    WebElement searchButton;
    @FindBy(xpath = "//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[3]/a[1]")
    WebElement motors;
    @FindBy(xpath="//*[@class='gh-cart-icon']")
    WebElement shoppingCart;
    @FindBy(xpath ="//a[contains(text(),'Start shopping')]")
    WebElement startShopping;
    @FindBy(id ="gh-shop-ei")
    WebElement shopByCategory;
    @FindBy(id="gh-Alerts-i")
    WebElement notification;
    public void searchItems() {
        Actions ac = new Actions(driver);
        ac.moveToElement(searchBox).click().build().perform();
        ac.moveToElement(searchBox).sendKeys("pencil").build().perform();
        searchButton.click();
    }
    public void notificaton(){
        notification.click();
    }
    public void shopByCategory(){
        shopByCategory.click();
    }
    public void mouseOverElement() throws InterruptedException {
        mouseHover("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[3]/a[1]");
        Thread.sleep(3000);
    }
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void shoppingCart(){
    shoppingCart.click();
    startShopping.click();
}
public void getMotorsOptionsPartsAndAccessories() throws InterruptedException {
    mouseOverElement();
    List<WebElement> partsAndAccessories = driver.findElements(By.xpath("//div[@class='hl-cat-nav']//li[3]//div[2]//div[1]//div[1]//a"));
    for (WebElement e : partsAndAccessories) {
        String items = e.getText();
        System.out.println(items);
    }
}
        public void getFashionTopCategories() throws InterruptedException {
        mouseHover("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[4]/a[1]");
        Thread.sleep(3000);
        List<WebElement>topCategories=driver.findElements(By.xpath("//div[@class='hl-cat-nav']//li[4]//div[2]//div[1]//div[1]//a"));
                  for(WebElement e:topCategories){
                      String items=e.getText();
                      System.out.println(items);
                     // mouseHoverClickWebElement("//a[contains(text(),\"Women's Clothing\")]");
                  }
    }
    public MotosPage goToMotorsPage(){
        motors.click();
        return new MotosPage(driver);
    }


}


