package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
     @CacheLookup
     @FindBy(id = "user-name")
     WebElement Username;

    @CacheLookup
    @FindBy(id="password")
    WebElement Password;

    @CacheLookup
    @FindBy(id= "login-button")
    WebElement Login;

    public void clickOnUsername(){
        clickOnElement(Username);
        log.info("Clicking on Username:"+ Username.toString());

    }
    public void clickOnPassword(){
        clickOnElement(Password);
        log.info("Clicking on Password:"+ Password.toString());
    }
    public void enterUsername(String username){
        sendTextToElement(Username,username);
    }
    public void enterPassword(String password){
        sendTextToElement(Password,password);
    }
    public void clickOnLoginLink() {
      clickOnElement(Login);
        log.info("Clicking on login link : " + Login.toString());
    }
    }


