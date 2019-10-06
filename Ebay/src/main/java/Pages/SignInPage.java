package Pages;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
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
    @FindBy(xpath="//button[@id='signin_fb_btn']")
    WebElement signInFB;
    @FindBy(xpath="//input[@id='email']")
    WebElement signInFBEmail;
    @FindBy(xpath="//input[@id='pass']")
    WebElement signInFBPassword;
    public  void invalidSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInButton.click();
        createAccount.click();
        return new AccountPage(driver);
    }
    public void positiveSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    signInButton.click();
    userName.sendKeys("ksultana102@gmail.com");
    password.sendKeys("Dmlnsr007");
    }
    public void positiveSignInFromExcel(String Userame,String Password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInButton.click();
        userName.sendKeys(Userame);
        password.sendKeys(Password);
    }
    public void failToSignInThroughFB(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInButton.click();
        signInFB.sendKeys("sam456kisuar@yahoo.com");
        signInFBEmail.sendKeys("1234");
    }
}
