package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends CommonAPI {

    SignInPage signIn;
    @BeforeMethod
    public void setUp(){
    signIn=new SignInPage(driver);
    }
    @Test
    public void testInvalidSignIn(){
    signIn.invalidSignIn();
    String errorMessage=driver.findElement(By.xpath("//div[@class='signin-view-container']//span[@class='inline-notice__content']")).getText();
    Assert.assertEquals(errorMessage,"Oops, that's not a match.");
    }









}
