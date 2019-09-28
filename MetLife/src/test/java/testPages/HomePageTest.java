package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage home;

    @BeforeMethod
    public void setUp() {

        home = new HomePage(driver);
    }


////   #test 1
//    @Test
//    public void logoTest() {
//        home.logo();
//
//    }
////    #test 2
//    @Test
//    public void testFeedBack(){
//        home.feedback();
//
//    }
//
//
//    @Test
//    public void testLoginButton() throws InterruptedException {
//
//        home.logInButton();
//        Thread.sleep(2000);
//    }
//    @Test
//   public void testInvalidLogIn(){
//      home.InvalidLogIn();}

//     @Test
//     public void testSearchIconWorksProperly(){
//        home.searchOption();
//    }

//    @Test
//    public void VerifyPageTitleTest() {
//        String title = driver.getTitle();
//        System.out.println("the page title is:" + title);
//        Assert.assertEquals(title,"Insurance and Employee Benefits | MetLife");
//
//
//
//    }
//
//
//    @Test
//    public void VerifyFaceBookIcon() throws InterruptedException {
//        home.faceBookIcon();
//        Thread.sleep(5000);
//    }
//
//    @Test
//    public void SucessfullyFaceBookLogin(){
//        home.SucessfullyLogInFacebook();
//    }
//     @Test
//    public void verifyAboutMouseHover() throws InterruptedException {
//        home.aboutMouseHover();
//        Thread.sleep(4000);


//     @Test
//    public void verifySolutionMouseHover() throws InterruptedException{
//        home.solutionMouseHover();
//        Thread.sleep(3000);
//
//     }
//     @Test
//    public void verifySupportMouseHover(){
//        home.supportMouseHover();
//

//
//
//     }
//
//        public  void verifyFacetimeNumber(){
//        home.facetimeNumberAtHomePage();
//  }
//
//}}
//
//
//
//
//
//    @Test
//    public void findADentistIsClickable() throws InterruptedException {
//        home.findADentistOption();
//        Thread.sleep(2000);
//    }
     @Test
    public void verifyheaderWhatWouldYouLikeToDo(){
        home.headerWhatWouldYouLikeToDo();
     }
}


