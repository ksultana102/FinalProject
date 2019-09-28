package testPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotosPage extends CommonAPI {
@FindBy(xpath ="//h2[contains(text(),'Find Parts & Accessories')]")
WebElement motorTitle;
@FindBy(xpath ="//div[@id='w7-w0-0-MOTORCYCLE-tab']//span[contains(text(),'Motorcycles')]")
WebElement motoCycles;
@FindBy(xpath ="//select[@name='Year']")
WebElement Year;
@FindBy(xpath = "//span[@id='w7-w0-CAR_AND_TRUCK_1']//select[@name='Make']")
WebElement make;
@FindBy(xpath = "//select[@name='Trim']")
WebElement trim;
@FindBy(xpath = "//span[@id='w7-w0-CAR_AND_TRUCK_2']//select[@name='Model']")
WebElement model;
@FindBy(xpath = "//select[@name='Engine']")
WebElement engine;
@FindBy(xpath = "//button[@id='w7-w0-1']")
WebElement findPartButton;

public MotosPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

public String titleIsDisplayed(){
    String text=motorTitle.getText();
    System.out.println(text);
    return text;
}
public boolean elementIsDisabled(WebElement element) {
    if (element.isEnabled()) ;
    return false;
}
public boolean elementIsEnabled(WebElement element){
    if(element.isEnabled());
    return true;
}
public void findParts(){
    selectElementByValue(Year,"2016");
    selectElementByValue(make,"Nissan");
    selectElementByValue(model,"Murano");
    selectElementByValue(trim,"SL Sport Utility 4-Door");
    selectElementByValue(engine,"3.5L 3498CC V6 GAS DOHC Naturally Aspirated");
    findPartButton.click();
}















}
