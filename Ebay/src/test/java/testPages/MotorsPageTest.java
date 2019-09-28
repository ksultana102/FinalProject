package testPages;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MotorsPageTest extends CommonAPI {
    HomePage home;
    MotosPage motor;
    @BeforeMethod
    public void setUp(){
        home= new HomePage(driver);
        motor=new MotosPage(driver);
    }
    @Test
    public void testFindParts(){
       motor= home.goToMotorsPage();
       motor.findParts();
    }
    @Test
    public void testMotorPageTitleIsDisplayed(){
       motor= home.goToMotorsPage();
        motor.titleIsDisplayed();
        Assert.assertEquals(motor.titleIsDisplayed(),"Find Parts & Accessories");
    }

}
