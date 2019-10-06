package Pages;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class MotorsPageTest extends CommonAPI {
    HomePage home;
    MotosPage motor;
    @BeforeMethod
    public void setUp() {
        home = new HomePage(driver);
        motor = new MotosPage(driver);
    }
    @Test//1
    public void testFindParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.findParts();
    }
    @Test//2
    public void testMotorPageTitleIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.titleIsDisplayed();
        Assert.assertEquals(motor.titleIsDisplayed(), "Find Parts & Accessories");
    }
    @Test//3
    public void imageIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.imageOfMotorPage();
    }
    @Test//4
    public void getYearDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.yearDropDownMenu();
    }
    @Test//5
    public void getMakeDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.yearDropDownMenu();
        motor.makeDropDownMenu();
    }
    @Test//6
    public void getModelDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.yearDropDownMenu();
        motor.makeDropDownMenu();
        motor.modelDownMenu();
    }
    @Test//7
    public void getTrimDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.yearDropDownMenu();
        motor.makeDropDownMenu();
        motor.modelDownMenu();
        motor.trimDropDownMenu();
    }
    @Test//8
    public void getViewDiagram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.viewDiagramBarColorChage();
    }
    @Test//9
    public void getGoingFast() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.goingFastBarColorChange();
    }
    @Test//10
    public void testOtherVehiclesDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.otherVehiclesDropDownMenu();
    }
    @Test//11
    public void verifyYearIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.elementIsEnabled(motor.Year);
    }
    @Test//12
    public void verifyMakeIsDisabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.elementIsDisabled(motor.make);
    }
    @Test//13
    public void testAllPartsAndAccessories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.allPartsAndAccessories();
    }
    @Test//14
    public void testCarAndTruckParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.carAndTruckParts();
    }
    @Test//15
    public void testWheelsAndTireParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.wheelsAndTireParts();
    }
    @Test//16
    public void testMotorCyclesParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.motorCyclesParts();
    }
    @Test//17
    public void testATV(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.ATV();
    }
    @Test//18
    public void testCommercialTruckParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.commercialTruckParts();
    }
    @Test//19
    public void testAutomotiveTools(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.automotiveTools();
    }
    @Test//20
    public void testCarsAndTrucks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.carAndTruckParts();
    }
    @Test//21
    public void testClassicCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.classicCar();
    }
    @Test//22
    public void testCollectorCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.collectorCar();
    }
    @Test//23
    public void testElectricAndHybridCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.electricAndHybridCar();
    }
    @Test//24
    public void testExoticCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.exoticCar();
    }
    @Test//25
    public void testBoats(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.boats();
    }
    @Test//26
    public void testCommercialTruck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.commercialsTruck();
    }
    @Test//27
    public void testMotorCycles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.motorCycles();
    }
    @Test//28
    public void testPowerSports(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.powerSports();
    }
    @Test//29
    public void testRvsAndCampers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.rvsAndCampers();
    }
    @Test//29
    public void testTraliers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.trailers();
    }
    @Test//30
    public void testOtherVehicles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.otherVehicles();
    }
    @Test//31
    public void testMotorSDailyDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.motorsDailyDeals();
    }
    @Test//32
    public void testMotorSalesAndEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.motorSalesAndEvents();
    }
    @Test//32
    public void testCarCares(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.carCares();
    }
    @Test//33
    public void testDigitalManual(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.digitalManual();
    }
    @Test//34
    public void testVirtualTech(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.virtualTech();
    }
    @Test//35
    public void testShipTires(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.shipTires();
    }
    @Test//36
    public void testBlog(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.blog();
    }
    @Test//37
    public void testPartsSalesHub(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.partsSalesHub();
    }
    @Test//37
    public void testSellParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.sellParts();
    }
    @Test//37
    public void testSellVehicles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.sellVehicles();
    }
    @Test//37
    public void testDealerSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motor = home.goToMotorsPage();
        motor.dealerSupport();
    }

}
