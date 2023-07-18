@Directory
Feature: Dashboard page
  I want to use this template for my Directory Page

#  Background:
#    Given User login to HRM application with UserName and Password
#      | Admin | admin123 |

  @DirectoryTabIsSearchButtonDisplayed
  Scenario: DirectoryTabIsSearchButtonDisplayed
    Then User is on Directory page
    Then Is Search button displayed