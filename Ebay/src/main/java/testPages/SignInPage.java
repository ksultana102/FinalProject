package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {
    @FindBy(css = "#gh-ug > a")
    WebElement signInButton;
    @FindBy(xpath ="//input[@id='userid']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement login;
    @FindBy(css="#InLineCreateAnAccount")
    WebElement createAccount;

    public  void invalidSignIn() {
        signInButton.click();
        userName.sendKeys("kisuar.sultana96@qmail.cuny.edu");
        password.sendKeys("samia");
        login.click();
    }
    public SignInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public AccountPage goToAccountPage(){
        signInButton.click();
        createAccount.click();
        return new AccountPage(driver);
    }

public void positiveSignIn(){
    signInButton.click();
    userName.sendKeys("kisuar.sultana96@qmail.cuny.edu");
    password.sendKeys("Kisuar1234@");

    }
    public void positiveSignInFromExcel(String Userame,String Password){
        signInButton.click();
        userName.sendKeys(Userame);
        password.sendKeys(Password);

    }


}
