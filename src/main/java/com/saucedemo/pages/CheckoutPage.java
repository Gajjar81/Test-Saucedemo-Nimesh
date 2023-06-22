package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import javafx.geometry.Pos;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log= LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id="first-name")
    WebElement FirstName;

    @CacheLookup
    @FindBy(id="last-name")
    WebElement LastName;

    @CacheLookup
    @FindBy(id="postal-code")
    WebElement PostalCode;

    @CacheLookup
    @FindBy(id="continue")
    WebElement Continue;

    @CacheLookup
    @FindBy(id="finish")
    WebElement Finish;

    public void enterFirstName(String firstname){
        sendTextToElement(FirstName,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(LastName,lastname);
    }
    public void enterPostalCode(String postalcode){
        sendTextToElement(PostalCode,postalcode);
    }
    public void clickOnContinue(){
        clickOnElement(Continue);
    }
    public void clickOnFinish(){
        clickOnElement(Finish);
    }

}
