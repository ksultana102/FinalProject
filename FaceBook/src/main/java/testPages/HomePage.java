package testPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(id = "loginbutton")
    WebElement logInButton;
    @FindBy(name = "websubmit")
    WebElement signUpButton;
    @FindBy(xpath = "//a[contains(text(),'Forgot account?')]")
    WebElement forgotAccount;
    @FindBy(name = "firstname")
    WebElement firstName;
    @FindBy(name = "lastname")
    WebElement lastName;
    @FindBy(name = "reg_email__")
    WebElement mobileNumberOrEmail;
    @FindBy(name = "reg_email_confirmation__")
    WebElement reEnterEmail;
    @FindBy(name = "reg_passwd__")
    WebElement newPassword;
    @FindBy(xpath = "//a[@id='birthday-help']//i[@class='img sp_aNr2s_dNJSQ sx_2e8aa9']")
    WebElement clickForMoreInfo;
    @FindBy(css = "#u_0_9")
    WebElement genderFemaleSelection;

    @FindBy(css = "#u_0_a")
    WebElement genderMaleSelection;

    @FindBy(css = "#u_0_b")
    WebElement genderCustomSelection;
    @FindBy(css = "#month")
    WebElement birthdayMonth;
    @FindBy(css = "#day")
    WebElement birthdayDay;
    @FindBy(css = "#year")
    WebElement birthdayYear;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void successfulSignIn() throws InterruptedException {
        email.sendKeys("oalfaruque@gmail.com");
        password.sendKeys("15021972@dob");
        logInButton.click();
        Thread.sleep(5000);

        //searchbox.sendKeys("Sushmita Rajesh");
    }

    public void unsuccessfulSignIn() throws InterruptedException {
        email.sendKeys("oalfaruque@gmail.com");
        password.sendKeys("123");
        logInButton.click();
        Thread.sleep(5000);
    }

    public void signUpButtonClickable() throws InterruptedException {
        signUpButton.click();
        Thread.sleep(5000);
    }

    public void setForgotAccount() throws InterruptedException {
        forgotAccount.click();
        Thread.sleep(5000);
    }

    public void firstNameField() throws InterruptedException {
        firstName.sendKeys("Rebecca");
        Thread.sleep(5000);
    }

    public void lastNameField() throws InterruptedException {
        lastName.sendKeys("Robbledo");
        Thread.sleep(5000);
    }

    public void mobileNumberOrEmailField() throws InterruptedException {
        mobileNumberOrEmail.sendKeys("mikemiller26092019@gmail.com");
        Thread.sleep(5000);
    }

    public void newPasswordField() throws InterruptedException {
        newPassword.sendKeys("01012001@dob");
        Thread.sleep(5000);
    }

        public void moreInfoSign() throws InterruptedException {
        clickForMoreInfo.click();
            Thread.sleep(5000);
    }
    public void genderFemaleSelectionButton() throws InterruptedException {
        genderFemaleSelection.click();
        Thread.sleep(5000);
    }
    public void genderMaleSelectionButton() throws InterruptedException {
        genderMaleSelection.click();
        Thread.sleep(5000);
    }
    public void genderCustomSelectionButton() throws InterruptedException {
        genderCustomSelection.click();
        Thread.sleep(5000);
    }
    public void birthdayMonthOption() throws InterruptedException {
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByVisibleText("Dec");
        Thread.sleep(5000);
    }
    public void birthdayDayOption() throws InterruptedException {
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByVisibleText("15");
        Thread.sleep(5000);
    }
    public void birthdayYearOption() throws InterruptedException {
        Select selectYear = new Select(birthdayYear);
        selectYear.selectByVisibleText("1905");
        Thread.sleep(2000);
    }

    public void createANewAccount() throws InterruptedException {
        firstName.sendKeys("Mike");//Typing First Name
        lastName.sendKeys("Miller");//Typing Last Name
        mobileNumberOrEmail.sendKeys("mikemiller26092019@gmail.com");//Typing Email address
        reEnterEmail.sendKeys("mikemiller26092019@gmail.com");//Re-typing Email address
        newPassword.sendKeys("01012001@dob");//Typing password
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByVisibleText("Jan");//Selecting Month January
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByVisibleText("1");//Selecting Day 01
        Select selectYear = new Select(birthdayYear);
        selectYear.selectByVisibleText("2001");//Selecting Year 2001
        genderMaleSelection.click();//Selecting Gender as Male
        //signUpButton.click();
        Thread.sleep(5000);//Screen sleeps for five seconds to see inputs
    }
}


