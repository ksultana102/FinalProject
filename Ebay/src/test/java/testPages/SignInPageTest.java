package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Xl_Reader;

import java.io.IOException;

public class SignInPageTest extends CommonAPI {

    SignInPage signIn;
    String path="D:\\FinalFrameWorkTeam3\\Ebay\\src\\test\\resources\\userName_password.xlsx";

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
    @Test
    public void testCreateAccount(){
        signIn.goToAccountPage();
    }

@Test
    public void testPositiveSignIn(){
        signIn.positiveSignIn();
}
@DataProvider
public Object[][] supplyData() throws IOException {
        Object[][] data= Xl_Reader.xl_Reader(path,"sheet1");
        return data;
}
@Test(dataProvider = "supplyData")
    public void signInFromExcelTest(String Username,String Password){
        signIn.positiveSignInFromExcel(Username, Password);
}
}
