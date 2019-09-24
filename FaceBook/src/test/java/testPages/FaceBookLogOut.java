package home;

 import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;
 import org.testng.annotations.Test;

public class FaceBookLogOut extends CommonAPI {

    @Test
        public void Test1(){
            //WebDriver driver = new ChromeDriver();
            driver.findElement(By.id("email")).sendKeys("oalfaruque@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("15021972@dob");
            driver.findElement(By.id("loginbutton")).click();
//            driver.findElement(By.cssSelector("#userNavigationLabel")).click();
//            driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).();
//        Select dropdown = new Select(driver.findElement(By.cssSelector("#userNavigationLabel")));
//        dropdown.selectByVisibleText("Log Out");


        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
//        if(logout.isEnabled() && logout.isDisplayed()) {
//            logout.click();
//        }
//        else {
//            System.out.println("Element not found");
//        }

    }
}
