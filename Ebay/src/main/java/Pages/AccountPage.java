package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class AccountPage extends CommonAPI {
    @FindBy(css="#firstname")
    WebElement firstName;
    @FindBy(css= "#lastname")
    WebElement lastName;
    @FindBy(css="#email")
    WebElement email;
    @FindBy(css="#PASSWORD")
    WebElement passWord;
    @FindBy(css=" #ppaFormSbtBtn")
    WebElement createAccountButton;
    @FindBy(xpath = "//div[@class='giant-text-2']")
    WebElement title;
    @FindBy(css = "#signin_fb_btn")
    WebElement fbLogin;
    @FindBy(css="#link_btn")
    WebElement linkYourAccount;
    public AccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void createAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstName.sendKeys("Kisuar");
        lastName.sendKeys("Sultana");
        email.sendKeys("Momtaz325@gmail.com");
        passWord.sendKeys("Dmlnsr007");
        createAccountButton.click();
    }
    public boolean titleIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(title.getText());
       if (title.getText().equalsIgnoreCase("Create an account"));
        return true;
    }
public void logInWithFBook(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbLogin.click();
        linkYourAccount.isDisplayed();
        mouseHoverClickWebElement("#inflowfyp");
    }
}
