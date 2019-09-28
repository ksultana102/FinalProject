package testPages;

import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage home;
    @BeforeMethod
    public void setUp(){
        home=new HomePage(driver);
    }
    @Test
    public void testSearchItem(){
        home.searchItems();
    }
    @Test
    public void testMouseOverElement() throws InterruptedException {
        home.mouseOverElement();
        Thread.sleep(3000);
    }
    @Test
    public void testShoppingCart(){
        home.shoppingCart();
    }
    @Test
    public void testPartsAndAccessories() throws InterruptedException {
        home.getMotorsOptionsPartsAndAccessories();
    }
    @Test
    public void testFashion() throws InterruptedException {
        home.getFashionTopCategories();
    }
@Test
    public void testShopByCategory(){
        home.shopByCategory();
}
@Test
    public void testNotification(){
        home.notificaton();
}
}
