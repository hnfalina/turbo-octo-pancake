@SmokeTest
Feature: Player in Youtube Music

  I want to play music video using player

  Scenario: Non Login User start a song from Home page and see advertisement

    Given user open Youtube Music homepage
    And user see Music Youtube Home page
    When user click the first song in Quick picks section
    Then user redirected to music video screen
    And user verify ads is exist
    And user verify music video start
    And user see autoplay list in the right section of the screen
    And user see video control bar in the bottom of the screen
    And user close browser