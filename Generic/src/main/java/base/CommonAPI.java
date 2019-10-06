package base;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }

        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }


    @Parameters ({"useSauceLabs","userName", "key","os","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false")boolean useSauceLabs,@Optional("")String userName,
                      @Optional("ssk")String key, @Optional("windows")String os,@Optional("chrome") String browserName,
                      @Optional("77.0.3865.90")String browserVersion,@Optional("https://www.ebay.com/") String url)throws IOException{
        if(useSauceLabs == true){
            setUpCloudEnvironment(userName,key,os,browserName,browserVersion,url);
        }else{
            getLocalDriver(os, browserName, browserVersion, url);
        }

    }
    public static String getCurrentDate() {
        DateFormat data = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
        Date currentDate = new Date();
        return data.format(currentDate);
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }


    public void setUpCloudEnvironment(String userName, String key, String os, String browsername,
                                      String browserVersion,String url)throws IOException{

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(browsername);
        cap.setCapability("version", browserVersion);
        cap.setCapability("platform", os);
        this.driver = new RemoteWebDriver(new URL("http://"+userName +":"+ key + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    public void getLocalDriver(String os, String browserName, String browserVersion, String url){
        if (os.equalsIgnoreCase("windows")) {
            if(browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", "../Generic/Driver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "../Generic/Driver/chromedriver.exe");
                driver = new ChromeDriver();
            }
        } else if (os.equalsIgnoreCase("mac")) {
            if(browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", "../Generic/Driver/geckodriver");
                driver = new FirefoxDriver();
            } else if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "../Generic/Driver/chromedriver");
                driver = new ChromeDriver();
            }
        }
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    //Utilities Methods
    public String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }
    }
    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByText(String locator){
        driver.findElement(By.linkText(locator)).click();
    }
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeByXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeAndEnterByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).clear();
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeAndEnterByXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public List<WebElement> getWebElements(String locator){
        List<WebElement> element = driver.findElements(By.cssSelector(locator));

        return element;
    }
    public List<WebElement> getWebElementsByXpath(String locator){
        List<WebElement> element = driver.findElements(By.xpath(locator));

        return element;
    }

    public List<String> getListOfTextByCss(String locator){
        List<WebElement> element = driver.findElements(By.cssSelector(locator));
        List<String> text = new ArrayList<String>();

        for(WebElement st:element){
            text.add(st.getText());
        }
        return text;
    }

    public String getTextByCss(String locator){
        String text = driver.findElement(By.cssSelector(locator)).getText();

        return text;
    }

    public void displayText(List<String> text){
        for(String st:text){
            System.out.println(st);
        }
    }
    public void sleepFor(int sec)throws InterruptedException{
        Thread.sleep(sec * 1000);
    }
    public void mouseHover(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        Actions hover = action.moveToElement(element);
        hover.build().perform();
    }
    public void mouseHoverClickWebElement(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        Actions hover = action.moveToElement(element);
        hover.click().build().perform();
    }

    public void selectElementByVisibleText(String locator, String value){
        WebElement element = driver.findElement(By.xpath(locator));
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void selectElementByValue(WebElement element, String value){
        //WebElement element = driver.findElement(By.xpath(locator));
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByText(WebElement element, String value){
        //WebElement element = driver.findElement(By.xpath(locator));
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void iframeHandle(WebElement element){
        driver.switchTo().frame(element);
    }
    public void getLinks(String locator){
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitUntilToBeSelected(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public void navigateBack(){
        driver.navigate().back();
    }

    public WebDriver clickByWebElement(WebElement element){
        element.click();

        return driver;
    }
    public void scrollDown(String locator) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
}
