Feature: Checkout page test
  As a user I want fill the checkout information on saucedemo website

  Scenario: User should fill the checkout information successfully
    Given I am on Checkout  page
    When I enter FirstName "Martin"
    And I enter LastName "Luther"
    And I enter Postalcode "HA9 9GJ"
    And I click on Continue
    Then I click on Finish

