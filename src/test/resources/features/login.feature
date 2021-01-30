@login @smoke
Feature: Users should be able to login

  Scenario: the user login with valid cridentials
    Given the user is on the login page
    When the user enters cridentials
    Then the user should be able to login succesfully
