Feature: Homepage  Test
  As user I want to login into saucedemo website


  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on Login
    Then I should login successfully













