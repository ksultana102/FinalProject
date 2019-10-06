package Pages;

import Keyword.keyword;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeywordTest extends CommonAPI {
    keyword key;
    String path="D:\\Final_Project_FrameWork\\Ebay\\src\\test\\resources\\userName_password.xlsx";
    @BeforeMethod
    public void initialization(){
        key=new keyword(driver);
    }
    @Test
    public void testKeyword() throws IOException, InterruptedException {
        key.searchh(path,"Sheet2");
    }






}
