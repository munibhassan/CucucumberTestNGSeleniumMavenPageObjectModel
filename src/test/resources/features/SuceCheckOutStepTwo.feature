@SuceCheckOutStepTwo
Feature: Order Placed Successfully

  Background:
    Given I navigate to the login page
    When I enter my 'standard_user' and 'secret_sauce'
    And I click on the login button And LoggedIn Successfully
    And I click first 'Sauce Labs Backpack'
    And I click second 'Sauce Labs Bike Light'
    And '2' the product should be added to my cart
    Then Cart Page Should be Displayed
    Then Click On CheckOut Button
    And I enter 'Munib' And 'Hassan'
    And I enter '75085'
    Then Click On Continue Button And SuceCheckOutStepTwo Page Should be Displayed

  Scenario: Order Placed Successfully
    Then Click On Finish Button And CheckOutComplete Page Should be Displayed