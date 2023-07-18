@HRMLogin
Feature: Login to HRM Application
  I want to use this template for HRM Login page

  @LoginValidCredentials
  Scenario: LoginValidCredentials
    Given User login to HRM application with UserName and Password
      | Admin | admin123 |
