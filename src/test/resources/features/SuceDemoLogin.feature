@SuceDemoLogin
Feature: Login to SuceDemo Application


  Scenario Outline: LoginValidCredentials
    Given I navigate to the login page
    When I enter my '<username>' and '<password>'
    And I click on the login button And LoggedIn Successfully

    Examples:
      | username      | password      |
      | standard_user | secret_sauce  |
