package Pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utilities.Xl_Reader;

import java.io.IOException;

public class SignInPageTest extends CommonAPI {
    SignInPage signIn;
    String path = "D:\\FinalFrameWorkTeam3\\Ebay\\src\\test\\resources\\userName_password.xlsx";
    @BeforeMethod
    public void setUp() {
        signIn = new SignInPage(driver);
    }
    @Test//1
    public void testInvalidSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.invalidSignIn();
        String errorMessage = driver.findElement(By.xpath("//div[@class='signin-view-container']//span[@class='inline-notice__content']")).getText();
        Assert.assertEquals(errorMessage, "Oops, that's not a match.");
    }
    @Test//2
    public void testCreateAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.goToAccountPage();
    }
    @Test//3
    public void testPositiveSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.positiveSignIn();
    }
    @DataProvider
    public Object[][] supplyData() throws IOException {
        Object[][] data = Xl_Reader.xl_Reader(path, "sheet1");
        return data;
    }
    @Test(dataProvider = "supplyData")//4
    public void signInFromExcelTest(String Username, String Password) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.positiveSignInFromExcel(Username, Password);
    }
    @Test//4
    public void testfailToSignInThroughFB() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.positiveSignIn();
    }

}