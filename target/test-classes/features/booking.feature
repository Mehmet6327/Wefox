@acz
Feature: Verify Booking Status
  Scenario: Booking Status verification
    Given User is on the landing page
    And User is logged in
    When User clicks hotel invoice button
    Then User should see the booking status