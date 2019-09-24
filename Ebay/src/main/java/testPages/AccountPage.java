package testPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public AccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void createAccount(){
        firstName.sendKeys("Kisuar");
        lastName.sendKeys("Sultana");
        email.sendKeys("kisuar.sultana96@qmail.cuny.edu");
        passWord.sendKeys("Kisuar1234@");
        createAccountButton.click();
    }
    public boolean titleIsDisplayed(){
        System.out.println(title.getText());
       if (title.getText().equalsIgnoreCase("Create an account"));
        return true;
    }




}
