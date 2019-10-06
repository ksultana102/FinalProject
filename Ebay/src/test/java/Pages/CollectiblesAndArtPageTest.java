package Pages;

import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CollectiblesAndArtPageTest extends CommonAPI {
    HomePage home;
   CollectiblesAndArtPage CAN;
   @BeforeMethod
    public void setUp(){
        home=new HomePage(driver);
        CAN=new CollectiblesAndArtPage(driver);
    }
    @Test//1
    public void getImageInColletibles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.collectiblesAndArtImage();
   }
@Test//2
    public void getColor() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.ColorChangeOnMouseOverBidNow();
        Thread.sleep(3000);
   }
@Test//3
    public void getImageLink(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
CAN.collectiblesAndArtImageLink();
}
@Test//4
    public void IsAbleToslideImage() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.slideImage();
        Thread.sleep(3000);
}
@Test//5
    public void IsAbleToGetText(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.textoftheCollectibles();
}
@Test//6
    public void isAbleToSelectDropDownMenu() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.nortonLogo();
        Thread.sleep(3000);
}
@Test//7
    public void isAbleToHoverOverOnSignIn() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.singInHoverOver();
       Thread.sleep(3000);
   }
@Test//8
    public void isAbleToHoverOverPartners(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.singInHoverOver();
       CAN.partnersHoverOver();
}
@Test//9
    public void isAbleToHoverOverSecurityTopics(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.securityTopicsHoverOver();
}
@Test//10
    public void isAbleToHoverOverThreats(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.threatsHoverOver();
   }
    @Test//11
    public void isAbleToHoverOverSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.supportHoverOver();
    }
    @Test//12
    public void isAbleToHoverOverBuyNew(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.buyNewHoverOver();
    }
    @Test//13
    public void isAbleToHoverOverProducts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.productsHoverOver();
    }
    @Test//14
    public void isAbleToClickOnContact(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.contactPagePopUp();
    }
    @Test//15
    public void isAbleToClickFBlogo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.FBlogoOnContactPage();
        Thread.sleep(3000);
    }
    @Test//16
    public void notAbleToLogInFb() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.fbFailToLogIn();
        Thread.sleep(3000);
   }
    @Test//17
    public void testEmailToConnectSupport()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.emailToConnectSupport();
        Thread.sleep(3000);
    }
    @Test//18
    public void testSendEmailToConnectSupport()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CAN.sendEmailToConnectSupport();
        Thread.sleep(3000);
   }
    @Test//19
    public void testEmailToConnectSupportHoverOver()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.emailToConnectSupportHoverOver();
        Thread.sleep(3000);
   }
    @Test//20
    public void testComicImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
     CAN.comicImage();
    }
    @Test//21
    public void testStampsImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.stampsImage();
    }
    @Test//22
    public void testSportsMemorabilla(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.sportsMemorabilla();
    }
    @Test//23
    public void testAntiques(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.antiques();
    }
    @Test//24
    public void testEntertainment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.entertainment();
    }
    @Test//25
    public void testArt(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CAN.entertainment();
    }

}
