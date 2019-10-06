package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitleTest extends CommonAPI {
    WebDriver driver;
    @Test
    public void VerifyPageTitleTest() {
        String title = driver.getTitle();
        System.out.println("the page title is:" + title);
        Assert.assertEquals(title,"Evolution");


    }
}