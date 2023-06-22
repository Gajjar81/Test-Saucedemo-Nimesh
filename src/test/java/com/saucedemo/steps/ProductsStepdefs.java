package com.saucedemo.steps;

import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsStepdefs {
    @Given("^I am on prductspage$")
    public void iAmOnPrductspage() {
    }

    @When("^I click on SaucelabsBackpack$")
    public void iClickOnSaucelabsBackpack() {
        new ProductsPage().clickOnSauceLabBackpack();
    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() {
        new ProductsPage().clickOnAddtoCart();
    }

    @And("^I click on Checkout$")
    public void iClickOnCheckout() {
        new ProductsPage().clickOnCheckout();
    }

    @Then("^I am landed on Checkout page successfully$")
    public void iAmLandedOnCheckoutPageSuccessfully() {
    }
}
