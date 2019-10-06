package Pages;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class HomePageTest extends CommonAPI {
    HomePage home;
    @BeforeMethod
    public void setUp() {
        home = new HomePage(driver);
    }
    @Test//1
    public void testSearchItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.searchItems();
    }
    @Test//2
    public void testMouseOverElement() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.mouseOverElement();
        Thread.sleep(3000);
    }
    @Test//3
    public void testShoppingCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.shoppingCart();
    }
    @Test//4
    public void testPartsAndAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.getMotorsOptionsPartsAndAccessories();
    }
    @Test//5
    public void testFashion() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.getFashionTopCategories();
        Assert.assertEquals(false, true);
    }
    @Test//6
    public void testShopByCategory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.shopByCategory();
    }
    @Test//7
    public void testNotification() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.notificaton();
    }
    @Test//8
    public void testSelectCategories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.selectCategoryItem("Art");
    }
    @Test//9
    public void testGetAllCategories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.getAllCategories();
    }
    @Test//10
    public void testFashionGetText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.fashion();
        Thread.sleep(3000);
    }
    @Test//11
    public void testEbaySites() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.getEbaySites();
    }
    @Test//12
    public void testSelectEbaySitesCountry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.clickEbaySites();
        Thread.sleep(3000);
    }
    @Test//13
    public void logoIsDisplayed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.logoIsDisplayed();
        Thread.sleep(3000);
    }
    @Test//14
    public void editCatagoriesTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.selectCategoryItemBaby("Baby");
    }
    @Test//15
    public void getTextFromSlideShowImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        home.textFromSlideShowImage();
    }
    @Test//16
    public void testSlideShowImageViewHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.slideShowImageViewHoverOver();
    }
    @Test//17
    public void testslideShowImageFeaturedItemsHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.slideShowImageFeaturedItemsHoverOver();
    }
    @Test//18
    public void testChooseRadioButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.chooseRadioButton();
    }
    @Test//19
    public void testSlideShowLowestPrice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.slideShowImageFeaturedItemsSelect();
    }
    @Test//20
    public void testPriceRange() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        home.choosePriceRange();
    }
}