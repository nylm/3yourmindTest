@login @smoke
Feature: Users should be able to login

  Scenario: the user login with valid cridentials
    Given the user is on the login page
    When the user enters cridentials
    Then the user should be able to login succesfully




    # "NEGATIVE SCENARIO SAMPLE "

    #Scenario Outline : the user login with invalid cridentials
    # Given the user is on the login page
    # When the user enters "<username>" "<password>"
    # Then the user should not be able to login

  #Examples :
 #     | username                    | password  |
 #     | colbey.gresham@sixdrops.org |           |
 #     | colbey.gresham@sixdrops.org | 3yourmind |
 #     |                             | 1234asdf  |
 #     | michealjackson@gmail.com    |1234asdf   |
 #     |                             |           |
