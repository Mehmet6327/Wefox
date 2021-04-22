Feature: Reserve Hotel
  Scenario:

    Given User is on the landing page
    And User is logged in
    When User clicks hotel invoice button
    And User choose pay on arrival option
    Then User should see reserved status