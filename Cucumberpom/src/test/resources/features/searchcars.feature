@Search-Car
Feature: Acceptance testing to validate search car page is working fine
  I want to validate search car page for acceptance testing

  @Search-Car-Positive
  Scenario: Validate Search Car Page
    Given I am on homepage of "carsguide.com.au" of CarsGuide Website
    When I move to the menu
      | Menu          |
      | Cars for Sale |
      | Sell My Car   |
    And click on "Search Cars" link
    And select car brand as "TESLA" from car drop down
    And select model as "MODEL X" from model drop down
    And select location as "ACT - All" from location drop down
    And select price as "$200,000" from price drop down
    And click on Find_My_Next_Car button
    Then I should see list of search cars
    And page title should be "Tesla Model X Under 200000 for Sale ACT | carsguide"
