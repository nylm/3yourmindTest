@upload3D @smoke
Feature: User should able to upload 3D model

  Background:
    Given the user is on the home page

  Scenario: user upload 3D Model on homepage
    When the user clicks upload button and selects a file
    Then the user should be able to upload file succesfully
