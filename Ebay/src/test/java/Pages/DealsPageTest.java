package Pages;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class DealsPageTest extends CommonAPI {
    HomePage home;
    DealsPage deal;
    @BeforeMethod
    public void setUp() {
        home = new HomePage(driver);
        deal = new DealsPage(driver);
    }
    @Test//1
    public void testTechHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.techHoverOver();
    }
    @Test//2
    public void testdealsItemsSelect() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.dealsItemsSelect();
    }
    @Test//3
    public void testDealsItemsQuantity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.dealsItemsQuantity();
    }
    @Test//4
    public void testdealsItemsHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.dealsItemsHoverOver();
    }
    @Test//5
    public void testDealsItemsPictureHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.dealsItemsPictureHoverOver();
    }
    @Test//6
    public void testFashionHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.fashionHoverOver();
    }
    @Test//7
    public void testFashionItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.fashionItemsSelect();
    }
    @Test//8
    public void testSportingGoodsHoverOver(){
        deal.sportingGoodsHoverOver();
    }
    @Test//9
    public void testSportsAndGoodItemsS() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.sportsAndGoodItemsSelect();
        Thread.sleep(3000);
    }
    @Test//10
    public void testAutomotiveHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.automotiveHoveOver();
    }
    @Test//11
    public void testfeaturedHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.featuredHoveOver();
    }
    @Test//12
    public void testHomeAndGardenHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.homeAndGardenHoveOver();
    }
    @Test//13
    public void testOtherDealsHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.otherDealsHoveOver();
    }
    @Test//14
    public void testSalesAndEventsHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.salesAndEventsHoveOver();
    }
    @Test//15
    public void testTechItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.techItemsSelect();
    }
    @Test//16
    public void testFeaturedItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.featuredItemsSelect();
    }
    @Test//17
    public void testHomeAndGardenItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.homeAndGardenItemsSelect();
    }
    @Test//18
    public void testAutomotiveItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.automotiveItemsSelect();
    }
    @Test//19
    public void testOtherDealsItemsSelect() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deal.otherDealsItemsSelect();
    }
}
