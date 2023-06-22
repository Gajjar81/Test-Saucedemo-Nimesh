package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
       new HomePage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
       new HomePage().enterPassword(password);
    }

    @And("^I click on Login$")
    public void iClickOnLogin() {
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    }
}

