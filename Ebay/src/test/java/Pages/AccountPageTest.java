package Pages;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AccountPageTest extends CommonAPI {
    SignInPage signIn;
    AccountPage account;
    @BeforeMethod
    public void setUP(){
        signIn=new SignInPage(driver);
        account=new AccountPage(driver);
    }
    @Test//1
    public void createAccountTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account=signIn.goToAccountPage();
        account.createAccount();
        Assert.assertEquals(account.titleIsDisplayed(),true);
    }
    @Test//2
    public void titleIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account=signIn.goToAccountPage();
        account.createAccount();
        account.titleIsDisplayed();
    }
    @Test//3
    public void resetPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account=signIn.goToAccountPage();
        account.createAccount();
        account.logInWithFBook();
    }
}
