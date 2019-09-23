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
    public  void invalidSignIn() {
        signInButton.click();
        userName.sendKeys("ksultana102@gmail.com");
        password.sendKeys("samia");
        login.click();
    }
    public SignInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }







}
