package testPages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInFacebook extends CommonAPI {

        HomePage SignIn;
        @BeforeMethod
        public void setUp(){
            SignIn=new HomePage(driver);
        }
        @Test
        public void testPositiveSignIn(){
     SignIn.successfulSignIn();
     String text=driver.findElement(By.xpath("//span[@class='_5qtp']")).getText();
     Assert.assertEquals(text,"Create Post");
        }
        @Test
    public void testNegetiveSignIn(){
    SignIn.unsuccessfulSignIn();
        }
    }

