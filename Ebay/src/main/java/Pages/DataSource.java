package Pages;
import base.CommonAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DataSource extends CommonAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Pencil");
        itemsList.add("Ball");
        itemsList.add("TV");
        itemsList.add("Light");
        itemsList.add("Sofa");
        itemsList.add("Dress");
        itemsList.add("Book");
        return itemsList;
    }

     public void insertData() throws Exception {
        ConnectToSqlDB connectSQL = new ConnectToSqlDB();
       // connectSQL.insertDataFromArrayListToSqlTable(getItemValue(),"TestTwo","search");
         List<String> items = connectSQL.readDataBase("TestTwo","search");
         for (int i = 0; i < items.size(); i++) {
             driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(items.get(i), Keys.ENTER);
             driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
         }
    }
    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }



}

