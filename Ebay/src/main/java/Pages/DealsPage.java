package Pages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class DealsPage extends CommonAPI {
    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']//li[@class='hl-cat-nav__js-tab']/a[contains(text(),'Deals')]")
    WebElement deals;
    @FindBy(xpath = "//a[@id='nav_354993']//span[contains(text(),'Tech')]")
    WebElement tech;
    @FindBy(xpath = "//span[@class='ebayui-ellipsis-3']")
    WebElement dealsItems;

    public DealsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void techHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//li[@aria-label='Tech']");
    }

    public void dealsItemsSelect() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        dealsItems.click();
    }

    public void dealsItemsQuantity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        dealsItems.click();
        driver.findElement(By.xpath("//input[@id='qtyTextBox']")).sendKeys("2");
    }

    public void dealsItemsHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        dealsItems.click();
        mouseHover("//a[@id='_rvwlnk']");
    }

    public void fashionHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Fashion']");
    }

    public void dealsItemsPictureHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        dealsItems.click();
        mouseHover("//a[@id='vi_main_img_fs_thImg1']//img");
    }
    public void sportingGoodsHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Sporting Goods']");
    }
    public void fashionItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Fashion']");
        Thread.sleep(3000);
        List<WebElement> fashion = driver.findElements(By.xpath("//a[@class='navigation-desktop-flyout-link'][contains(text(),'Watches')]"));
        for (WebElement e : fashion) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void sportsAndGoodItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Sporting Goods']");
        Thread.sleep(3000);
        List<WebElement> sports = driver.findElements(By.xpath("//a[contains(text(),'Cycling')]"));
        for (WebElement e : sports) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void automotiveHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Automotive']");
    }
    public void featuredHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Featured']");
    }
    public void homeAndGardenHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Home & Garden']");
    }
    public void otherDealsHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Other Deals']");
    }
    public void techItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//li[@aria-label='Tech']");
        Thread.sleep(3000);
        List<WebElement> tech = driver.findElements(By.xpath("//a[contains(text(),'TV, Video & Home Audio')]"));
        for (WebElement e : tech) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void salesAndEventsHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Sales & Events']");
    }
    public void featuredItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("/ul[@class='ebayui-refit-nav-ul']//span[text()='Featured']");
        Thread.sleep(3000);
        List<WebElement> feature = driver.findElements(By.xpath("//a[contains(text(),'Best of Home & Garden')]"));
        for (WebElement e : feature) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void homeAndGardenItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Home & Garden']");
        Thread.sleep(3000);
        List<WebElement> garden = driver.findElements(By.xpath("//a[contains(text(),'Heating, Cooling & Air')]"));
        for (WebElement e : garden) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void automotiveItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Automotive']");
        Thread.sleep(3000);
        List<WebElement> automotive = driver.findElements(By.xpath("//a[contains(text(),'Tires & Wheels')]"));
        for (WebElement e : automotive) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void otherDealsItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
        mouseHover("//ul[@class='ebayui-refit-nav-ul']//span[text()='Other Deals']");
        Thread.sleep(3000);
        List<WebElement> otherDeals = driver.findElements(By.xpath("//a[contains(text(),'Packing & Shipping')]"));
        for (WebElement e : otherDeals) {
            String items = e.getText();
            System.out.println(items);
        }
    }
}
