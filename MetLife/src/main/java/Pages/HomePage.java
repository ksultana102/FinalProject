package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(css = "header.header:nth-child(5) div.container div.row div.col-12.header__container div.header__logo-container a:nth-child(1) > img.header__logo.img-responsive")
    WebElement MetlifeLogo;
    @FindBy(id = "oo_tab")
    WebElement FeedBack;
    @FindBy(xpath = "//div[@class='header__navigation-container-menu-item-title font-eyebrow-1'][contains(text(),'ABOUT US')]")
    WebElement AboutDropDwonMenu;
    @FindBy(xpath = "//div[@class='header__navigation-container-menu-item-title font-eyebrow-1'][contains(text(),'SUPPORT')] ")
    WebElement supportDropDownMenu;
    @FindBy(xpath = "//div[@class='header__navigation-container-menu-item-title font-eyebrow-1'][contains(text(),'SOLUTIONS')] ")
    WebElement SolutionDropDownMenu;
    @FindBy(xpath = "//p[contains(text(),'HEALTH')]")
    WebElement Health;
    @FindBy(xpath = "//p[contains(text(),'FUTURE')]")
    WebElement Future;
    @FindBy(xpath = "//p[contains(text(),'FAMILY')]")
    WebElement Family;
    @FindBy(xpath = "//p[contains(text(),'WORK')]")
    WebElement Work;
    @FindBy(xpath = "//div[@class='headline-text']")
    WebElement WhatWouldYouLikeToDo;
    @FindBy(xpath = "//div[@class='col-12 header__container']//img[@class='header__logo img-responsive']")
    WebElement MetLifeLogo;
    @FindBy(xpath = "//div[@class='header__utilities']//a[@class='header__login-trigger-label']")
    WebElement Login;
    @FindBy(xpath = "#login-select-tooltip")
    WebElement PersonalAccount;
}
