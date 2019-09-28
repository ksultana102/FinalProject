//package testPages;
//
//import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class SearchResultPageTest extends CommonAPI {
//
//
//    HomePage home;
//    SearchResultPage searchpage;
//    @BeforeMethod
//    public void setUp() {
//
//        searchpage = new SearchResultPage(driver);
//    }
//
//
//    @Test
//    public void testSearchPageWorksProperly() {
//        searchpage = home.goToSearchResultPage();
//        searchpage.searchPageWorkingProperly();
//        Assert.assertEquals(searchpage.titleIsDisplayed(),true);}
//
//
//        @Test
//
//        public void titleIsDisplayed(){
//            searchpage=home.goToSearchResultPage();
//
//            searchpage.titleIsDisplayed();
//        }
//
//
//
//
//    }
