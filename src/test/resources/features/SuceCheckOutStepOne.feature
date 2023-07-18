@SuceCheckOutStepOne
Feature: Select Product and Proceed to CheckOut Screen

  Background:
    Given I navigate to the login page
    When I enter my 'standard_user' and 'secret_sauce'
    And I click on the login button And LoggedIn Successfully
    And I click first 'Sauce Labs Backpack'
    And I click second 'Sauce Labs Bike Light'
    And '2' the product should be added to my cart
    Then Cart Page Should be Displayed
    Then Click On CheckOut Button

  Scenario Outline: Continue to User Informtion Screen
    And I enter '<first-name>' And '<last-name>'
    And I enter '<zip-code>'
    Then Click On Continue Button And SuceCheckOutStepTwo Page Should be Displayed

    Examples:
      | first-name | last-name | zip-code |
      | Munib      | Hassan    | 75085    |