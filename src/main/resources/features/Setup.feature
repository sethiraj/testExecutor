@Feature
Feature: Check feature testing

 @scenario1
  Scenario: Test Scenario
    Given I login to the application with username "admin"
    When I land on the home screen
    And I clickon the Admin Link
    Then I Validate the "View Products" is present
