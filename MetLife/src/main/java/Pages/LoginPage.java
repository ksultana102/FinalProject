package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath="/div[@class='header__utilities']//a[@class='header__login-trigger-label']")
    WebElement Login;
    @FindBy(xpath="#login-select-tooltip")
    WebElement PersonalAccount;
    @FindBy(id="loginUsername")
    WebElement UserName;
    @FindBy(id="loginPassword")
    WebElement Password;
    @FindBy(xpath = "//input[@class='btn-brand-1st js-submitLogin']")
    WebElement LogINButtonInLoginPage;
WebDriver driver;
    public void login(String personalAccount,String UserName,String Password){
      driver.findElement(By.xpath("#login-select-tooltip")).sendKeys("abcd");
      driver.findElement(By.id("loginUsername")).sendKeys("abcd");
      driver.findElement(By.id("loginPassword")).sendKeys("abcd");
      LogINButtonInLoginPage.click();
    }


    }

