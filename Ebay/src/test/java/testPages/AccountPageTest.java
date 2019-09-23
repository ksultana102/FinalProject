package testPages;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends CommonAPI {
    SignInPage signIn;
    AccountPage account;
    @BeforeMethod
    public void setUP(){
        signIn=new SignInPage(driver);
        account=new AccountPage(driver);
    }
    @Test
    public void createAccountTest(){
        account=signIn.goToAccountPage();
        account.createAccount();
        Assert.assertEquals(account.titleIsDisplayed(),true);
    }
    @Test
    public void titleIsDisplayed(){
        account=signIn.goToAccountPage();
        account.createAccount();
        account.titleIsDisplayed();
    }



}
