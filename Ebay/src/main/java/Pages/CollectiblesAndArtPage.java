package Pages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;
public class CollectiblesAndArtPage extends CommonAPI {
    @FindBy(xpath = "//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[6]/a[1] ")
    WebElement collectionAndArt;
    @FindBy(xpath = "//div[@class='title-banner__right-image'] ")
    WebElement collectionArtImage;
    @FindBy(xpath = "//button[@id='w8-bModCarousel-xCarousel-next']")
    WebElement slideBar;
    @FindBy(xpath = "//div[contains(text(),'Comics')]")
    WebElement imageLink;
    @FindBy(xpath = "//img[@id='gh-bti']")
    WebElement titleOfNFL;
    @FindBy(css = "#gf-norton")
    WebElement nortonLogo;
    @FindBy(xpath = "//a[contains(text(),'REPORT MISUSE')]")
    WebElement reportMisuse;
    @FindBy(xpath = " //input[@id='u_0_4']")
    WebElement fbLogo;
    @FindBy(xpath = "//a[contains(text(),'Email Us')]")
    WebElement emailOfContact;
    @FindBy(xpath = "//a[@class='btn btn-yellow btn-panel'][contains(text(),'Email')]")
    WebElement sendEmail;

    public CollectiblesAndArtPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void collectiblesAndArtImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        collectionArtImage.isDisplayed();
    }

    public void collectiblesAndArtImageLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        mouseHoverClickWebElement("//div[contains(text(),'Comics')]");
    }

    public void ColorChangeOnMouseOverBidNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        mouseHover("//div[contains(text(),'Comics')]");
        imageLink.click();
    }
    public void slideImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        slideBar.click();
    }
    public void textoftheCollectibles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        titleOfNFL.getText();
    }
    public void nortonLogo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        mouseHoverClickWebElement("//select[@name='lang']");
        Thread.sleep(3000);
        List<WebElement> English = driver.findElements(By.xpath("//option[contains(text(),'English')]"));
        for (WebElement e : English) {
            String items = e.getText();
            System.out.println(items);
        }
    }
    public void singInHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[contains(text(),'SIGN IN')]");
    }
    public void partnersHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Partners')]");
    }
    public void securityTopicsHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Security Topics')]");
    }
    public void threatsHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Threats')]");
    }
    public void supportHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Support')]");
    }
    public void buyNewHoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Buy/Renew')]");
    }
    public void productsHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHover("//a[@class='tablinks'][contains(text(),'Products')]");
    }
    public void contactPagePopUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
    }
    public void FBlogoOnContactPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
        mouseHoverClickWebElement("//span[@class='ico-c ico-s-facebook']");
    }
    public void fbFailToLogIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
        mouseHoverClickWebElement("//span[@class='ico-c ico-s-facebook']");
        mouseHoverClickWebElement(" //input[@id='u_0_4']");
    }
    public void emailToConnectSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
        emailOfContact.click();
    }
    public void sendEmailToConnectSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
        emailOfContact.click();
        sendEmail.click();
    }
    public void emailToConnectSupportHoverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("//a[contains(text(),'Contact Us')]");
        emailOfContact.click();
        mouseHover("//a[@class='btn btn-yellow btn-panel'][contains(text(),'Email')]");
    }
    public void comicImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Comics')]");
    }
    public void stampsImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Stamps')]");
    }
    public void sportsMemorabilla(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Sports Memorabilia & Fan Apparel')]");
    }
    public void antiques (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Antiques')]");
    }
    public void entertainment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Entertainment Memorabilia')]");
    }
    public void art(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectionAndArt.click();
        clickByXpath("//div[contains(text(),'Art')]");
    }

    public void selectCountry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nortonLogo.click();
        reportMisuse.click();
        mouseHoverClickWebElement("");
        Thread.sleep(3000);
        List<WebElement> English = driver.findElements(By.xpath("//option[contains(text(),'English')]"));
        for (WebElement e : English) {
            String items = e.getText();
            System.out.println(items);
        }
    }}



