Feature: Products Page Test
  As a user I want to search the Items and Buy from the saucedemo website

  Scenario: I want to click on Selected Products and Buy it.
    Given I am on prductspage
    When I click on SaucelabsBackpack
    And I click on Add to cart
    And I click on Checkout
    Then I am landed on Checkout page successfully