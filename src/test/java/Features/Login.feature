Feature: LoginFeature
  This feature will be for the login functionality

  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to the login page
    When I enter <username> and <password>
    And I click login button
    Then I should be logged in
    Examples:
      | username | password |
      | admin    | admin    |