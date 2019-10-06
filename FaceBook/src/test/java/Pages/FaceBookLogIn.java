package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    class FaceBookLogIn extends CommonAPI {

        @Test
        public void Test1(){
            //WebDriver driver = new ChromeDriver();
            driver.findElement(By.id("email")).sendKeys("oalfaruque@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("15021972@dob");
            driver.findElement(By.id("loginbutton")).click();
        }
    }
