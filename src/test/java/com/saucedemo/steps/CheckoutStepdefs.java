package com.saucedemo.steps;

import com.saucedemo.pages.CheckoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutStepdefs {
    @Given("^I am on Checkout  page$")
    public void iAmOnCheckoutPage() {
    }

    @When("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstname)  {
        new CheckoutPage().enterFirstName(firstname);
    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
       new CheckoutPage().enterLastName(lastname);
    }

    @And("^I enter Postalcode \"([^\"]*)\"$")
    public void iEnterPostalcode(String postalcode)  {
        new CheckoutPage().enterPostalCode(postalcode);
    }

    @And("^I click on Continue$")
    public void iClickOnContinue() {
    }

    @Then("^I click on Finish$")
    public void iClickOnFinish() {
    }
}
