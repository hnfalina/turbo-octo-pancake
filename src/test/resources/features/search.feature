@SmokeTest
Feature: Search in Youtube Music

  I want search a song with exact keyword and get result from all sections

  Scenario: User can search music video based on keyword

    Given user open Youtube Music homepage
    And user see Music Youtube Home page
    When user Search song with exact keyword Raisa
    And user press Enter
    Then user verify the result page will appear with all sections
    And user close browser