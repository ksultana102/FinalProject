package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginoptionClickable {
    WebDriver driver;
    loginoptionClickable login;

    public loginoptionClickable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }}

//    @Test
//    public void TestLoginOptionClickable(){
//     driver.findElement(By.xpath("//div[@class='header__utilities']//span[@class='header__login-label font-meta-1'][contains(text(),'LOG IN')]");
//
//////div[@class='header__utilities']//span[@class='header__login-label font-meta-1'][contains(text(),'LOG IN')]
////             //div[@class='header__utilities']//span[@class='header__login-label font-meta-1'][contains(text(),'LOG IN')]
////             /html/body/header/div/div/div/div[5]/div[1]/div/a/span