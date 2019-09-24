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
    public void searchItems() {
        Actions ac = new Actions(driver);
        ac.moveToElement(searchBox).click().build().perform();
        ac.moveToElement(searchBox).sendKeys("pencil").build().perform();
        searchButton.click();
    }
    public void mouseOverElement() throws InterruptedException {
        mouseHover("body.desktop.gh-flex:nth-child(2) div.main-content:nth-child(10) div.hl-cat-nav:nth-child(1) ul.hl-cat-nav__container:nth-child(1) li.hl-cat-nav__js-tab:nth-child(3) > a:nth-child(1)");
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
        List<WebElement> partsAndAccessories=driver.findElements(By.xpath("//div[@class='hl-cat-nav']//li[3]//div[2]//div[1]//div[1]//a"));
        for(WebElement e:partsAndAccessories){
            String items=e.getText().toString();
            System.out.println(e.getText().toString());
        }




}



}