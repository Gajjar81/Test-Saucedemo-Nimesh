$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Checkout.feature");
formatter.feature({
  "line": 1,
  "name": "Checkout page test",
  "description": "As a user I want fill the checkout information on saucedemo website",
  "id": "checkout-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6861001000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should fill the checkout information successfully",
  "description": "",
  "id": "checkout-page-test;user-should-fill-the-checkout-information-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Checkout  page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter FirstName \"Martin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter LastName \"Luther\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter Postalcode \"HA9 9GJ\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Finish",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutStepdefs.iAmOnCheckoutPage()"
});
formatter.result({
  "duration": 141218500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Martin",
      "offset": 19
    }
  ],
  "location": "CheckoutStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 22601700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Luther",
      "offset": 18
    }
  ],
  "location": "CheckoutStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 5472300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA9 9GJ",
      "offset": 20
    }
  ],
  "location": "CheckoutStepdefs.iEnterPostalcode(String)"
});
formatter.result({
  "duration": 3876900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.iClickOnContinue()"
});
formatter.result({
  "duration": 33700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.iClickOnFinish()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.after({
  "duration": 733645900,
  "status": "passed"
});
formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage  Test",
  "description": "As user I want to login into saucedemo website",
  "id": "homepage--test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5367032700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "homepage--test;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 466900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 18
    }
  ],
  "location": "HomepageStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 5600100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 18
    }
  ],
  "location": "HomepageStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 5484300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefs.iClickOnLogin()"
});
formatter.result({
  "duration": 46000,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefs.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 38400,
  "status": "passed"
});
formatter.after({
  "duration": 767189700,
  "status": "passed"
});
formatter.uri("Productspage.feature");
formatter.feature({
  "line": 1,
  "name": "Products Page Test",
  "description": "As a user I want to search the Items and Buy from the saucedemo website",
  "id": "products-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3817097800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I want to click on Selected Products and Buy it.",
  "description": "",
  "id": "products-page-test;i-want-to-click-on-selected-products-and-buy-it.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on prductspage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on SaucelabsBackpack",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am landed on Checkout page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsStepdefs.iAmOnPrductspage()"
});
formatter.result({
  "duration": 149600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsStepdefs.iClickOnSaucelabsBackpack()"
});
formatter.result({
  "duration": 20053773600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsStepdefs.iClickOnAddToCart()"
});
formatter.result({
  "duration": 20062154800,
  "status": "passed"
});
formatter.match({
  "location": "ProductsStepdefs.iClickOnCheckout()"
});
formatter.result({
  "duration": 20035867100,
  "status": "passed"
});
formatter.match({
  "location": "ProductsStepdefs.iAmLandedOnCheckoutPageSuccessfully()"
});
formatter.result({
  "duration": 33000,
  "status": "passed"
});
formatter.after({
  "duration": 840754000,
  "status": "passed"
});
});