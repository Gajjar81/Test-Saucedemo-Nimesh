package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {
    public static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath ="//a[@id='item_4_title_link']")
    WebElement Saucelabsbackpack;

    @CacheLookup
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement Addtocart;

    @CacheLookup
    @FindBy(id="checkout")
    WebElement Checkout;



    public void clickOnSauceLabBackpack(){
        clickOnElement(Saucelabsbackpack);
        log.info("Clicking on Saucelabsbackpack:"+ Saucelabsbackpack.toString());
    }
    public void clickOnAddtoCart(){
        clickOnElement(Addtocart);
        log.info("Clicking on AddtoCart:"+ Addtocart.toString());
    }
    public void clickOnCheckout(){
        clickOnElement(Checkout);
        log.info("Clicking on Checkout:"+ Checkout.toString());
    }
}
