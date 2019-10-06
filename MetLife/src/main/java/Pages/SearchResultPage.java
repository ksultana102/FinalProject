package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath ="//div[@class='header__utilities']//*[@class='icon icon-search'] ")
    WebElement HomepageSearchButton;


    @FindBy(xpath = "//input[@id='form-refineSearchQuery_sr'] ")
    WebElement searchBox;
    @FindBy(xpath = "//button[@class='btn-brand-2nd search-filter__button js-searchSubmit'] ")
    WebElement searchButton;
    @FindBy(xpath = "/h1[contains(@class,'page-title__heading')]")
    WebElement title;
    public SearchResultPage goToSearchResultPage(){
        HomepageSearchButton.click();

        return new SearchResultPage(driver);
    }


    public void searchPageWorkingProperly() {

        searchBox.sendKeys("car insurance");
        searchButton.click();}


    public boolean titleIsDisplayed(){
        System.out.println(title.getText());
        if (title.getText().equalsIgnoreCase("Create an account"));
        return true;
    }
}
