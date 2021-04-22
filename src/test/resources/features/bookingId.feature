Feature: Verify Booking Id
  Scenario: Booking Id verification
    Given User is on the landing page
    And User is logged in
    When User clicks hotel invoice button
    Then Booking id number and invoice number should be same