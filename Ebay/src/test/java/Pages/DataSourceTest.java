package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DataSourceTest extends CommonAPI {
    DataSource data=new DataSource();
    @Test
    public void connectDatabase() throws Exception {
      //  ConnectToSqlDB.connectToSqlDatabase();
            data= PageFactory.initElements(driver,DataSource.class);
                data.insertData();
    }
}
