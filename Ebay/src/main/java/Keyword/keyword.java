package Keyword;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class keyword extends CommonAPI {


    public keyword(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    static XSSFWorkbook wb=null;

    static XSSFSheet sheet=null;

    @FindBy(xpath = "//div[@id='gh-ac-box2']")
    WebElement searchBox;
    @FindBy(id = "gh-btn")
    WebElement searchButton;


    public void searchItems(String item) throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(searchBox).click().build().perform();
        searchBox.clear();
        ac.moveToElement(searchBox).sendKeys(item).build().perform();
        searchButton.click();
    }
    public void searchh(String path,String sheetName) throws IOException, InterruptedException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet(sheetName);
        int rows = sheet.getLastRowNum();
        int columns = 0;
        for (int i = 0; i < rows; i++) {
            String  searchItem = sheet.getRow(i + 1).getCell(columns ).toString();
            switch (searchItem) {
                case "Pencil":
                    searchItems(searchItem);
                    break;
                case "Toys":
                    searchItems(searchItem);
                    break;
                case "Iphone":
                    searchItems(searchItem);
                    break;
                case "women's clothing":
                    searchItems(searchItem);
                    break;
                case "shoes":
                    searchItems(searchItem);
                    break;
                default:
                    throw new IllegalArgumentException("Element search box is not found");
            }
        }

    }

}
