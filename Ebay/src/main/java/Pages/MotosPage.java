package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

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
@FindBy(xpath ="//section[3]//div[2]//a[1]")
WebElement imageofMotor;
@FindBy(xpath ="//a[contains(text(),'View Diagrams')]")
WebElement viewDiagram;
@FindBy(xpath ="//a[contains(text(),'Going Fast')]")
WebElement goingFast;

public MotosPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
public void imageOfMotorPage(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    imageofMotor.isDisplayed();
    mouseHoverClickWebElement("//div[contains(text(),'Parts & Accessories')]");
}

public String titleIsDisplayed(){
    String text=motorTitle.getText();
    System.out.println(text);
    return text;
}
public boolean elementIsDisabled(WebElement element) {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    if (element.isEnabled()) ;
    System.out.println(element.getText()+" is Disabled.");
    return false;
}
public boolean elementIsEnabled(WebElement element){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    if(element.isEnabled());
    System.out.println(element.getText()+" is Enabled.");
    return true;
}
public void findParts(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    selectElementByValue(Year,"2016");
    selectElementByValue(make,"Nissan");
    selectElementByValue(model,"Murano");
    selectElementByValue(trim,"SL Sport Utility 4-Door");
    selectElementByValue(engine,"3.5L 3498CC V6 GAS DOHC Naturally Aspirated");
    findPartButton.click();
}
    public void yearDropDownMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectElementByValue(Year,"2012");
    }
    public void makeDropDownMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectElementByValue(Year,"2017");
        selectElementByValue(make,"Dina");
    }
    public void modelDownMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectElementByValue(Year,"2017");
        selectElementByValue(make,"Dina");
        selectElementByValue(model,"Brighter");
    }
    public void trimDropDownMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectElementByValue(Year,"2017");
        selectElementByValue(make,"Dina");
        selectElementByValue(model,"Brighter");
        selectElementByValue(trim,"Base Bus (Non School) - Cab Forward 6-Door");
    }
   public void viewDiagramBarColorChage(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    mouseHover("//a[contains(text(),'View Diagrams')]");
       viewDiagram.click();
   }
public void goingFastBarColorChange(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    mouseHover("//a[contains(text(),'Going Fast')]");
goingFast.click();
}
public void otherVehiclesDropDownMenu(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    mouseHoverClickWebElement("//div[@id='w7-w0-0-OTHER_VEHICLE-tab']//span[contains(text(),'Other Vehicles')]");
}
    public void allPartsAndAccessories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'All Parts & Accessories')]");
    }
    public void carAndTruckParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Car & Truck Parts')]");
    }
    public void wheelsAndTireParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Wheels, Tires & Parts')]");
    }
    public void motorCyclesParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Motorcycle Parts')]");
    }
    public void ATV(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'ATV, Side-by-Side, & UTV Parts')]");
    }
    public void commercialTruckParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Commercial Truck Parts')]");
    }
    public void automotiveTools(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Automotive Tools & Supplies')]");
    }
    public void carsAndTrucks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Cars & Trucks')]");
    }
    public void classicCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Classic Cars')]");
    }
    public void collectorCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Collector Cars')]");
    }
    public void electricAndHybridCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Electric & Hybrid Cars')]");
    }
    public void exoticCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Exotic Cars')]");
    }
    public void boats(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Boats')]");
    }
    public void commercialsTruck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Commercial Trucks')]");
    }
    public void motorCycles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[@class='b-textlink b-textlink--parent'][contains(text(),'Motorcycles')]");
    }
    public void powerSports(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Powersports')]");
    }
    public void rvsAndCampers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'RVs & Campers')]");
    }
    public void trailers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Trailers')]");
    }
    public void otherVehicles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Other Vehicles')]");
    }
    public void motorsDailyDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Motors Daily Deals')]");
    }
    public void motorSalesAndEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Motors Sales & Events')]");
    }
    public void carCares(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Car Care - Do It Yourself')]");
    }
    public void digitalManual(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Digital Manuals - Instant Online Repair Manuals')]");
    }
    public void virtualTech(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Virtual Tech - Get Help from a Certified Technicia')]");
    }
    public void shipTires(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Ship Tires to a Local Installer')]");
    }
    public void blog(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Check Out Our Blog')]");
    }
    public void partsSalesHub(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Parts Sales hub')]");
    }
    public void sellParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Sell your parts')]");
    }
    public void sellVehicles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Sell your vehicle')]");
    }
    public void dealerSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Dealer Support')]");
    }
}
