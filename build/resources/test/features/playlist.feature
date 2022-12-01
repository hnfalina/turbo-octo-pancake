@SmokeTest
Feature: Playlist in Youtube Music

  I want to create a new playlist

  Scenario: User can create a new playlist

    Given user open Youtube Music homepage
    And user see Music Youtube Home page
    And user Hanifa login using user hanifanur.test and password hanifatest
    And user go to https://music.youtube.com/library/playlists
    When user create a New Playlist
    And user verify the new created playlist
    And user close browser
