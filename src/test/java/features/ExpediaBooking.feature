Feature: Expedia Various Types of Booking

  Scenario Outline: As a user I want to search Hotels in Expedia
    Given I am navigated to Expedia
    When I choose Hotel Booking Tab
    And I provide <Destination> Hotel Booking Information
    Then I should be able to view list of Hotel Search result

    Examples:
      | Destination |
      | dataset1 |
      | dataset2 |
      | dataset3 |



