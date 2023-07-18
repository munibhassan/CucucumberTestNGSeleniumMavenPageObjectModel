@SuceInventory
Feature: Select Product and Proceed to CheckOut Screen

  Background:
    Given I navigate to the login page
    When I enter my 'standard_user' and 'secret_sauce'
    And I click on the login button And LoggedIn Successfully

  Scenario Outline: Select Any Two Product With Name and Proceed to CheckOut Page
    Given Given I am logged in
    And I click first '<product-name1>'
    And I click second '<product-name2>'
    And '<items-count>' the product should be added to my cart
    Then Cart Page Should be Displayed
    Examples:
      | product-name1       | product-name2         | items-count |
      | Sauce Labs Backpack | Sauce Labs Bike Light | 2           |