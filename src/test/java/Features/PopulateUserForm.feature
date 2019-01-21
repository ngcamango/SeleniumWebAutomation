Feature: PopulateUserFormFeature
  This feature will be for populating the user form

  Scenario Outline: Populate user form with valid details
    Given I have succesfully logged in with <username> and <password>
    When I select the <title>
    And enter the <initial> and <firstname> as well as <middlename>
    Then I should be able to <gender> and <language> and save the details entered
    Examples:
      | username | password | title | initial | firstname | middlename | gender | language |
      | admin    | admin    | Mr.   | R       | Ramsey    | Bolton     | Male   | english  |