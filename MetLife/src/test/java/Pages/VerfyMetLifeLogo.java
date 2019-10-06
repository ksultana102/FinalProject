package Pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerfyMetLifeLogo extends CommonAPI {

    @Test
    public void verifyMetLifeLogoTest(){
       boolean flag= driver.findElement(By.xpath("/div[@class='col-12 header__container']//img[@class='header__logo img-responsive'] ")).isDisplayed();
        Assert.assertTrue(flag);


    }
}
