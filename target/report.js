$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("player.feature");
formatter.feature({
  "line": 2,
  "name": "Player in Youtube Music",
  "description": "\nI want to play music video using player",
  "id": "player-in-youtube-music",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Non Login User start a song from Home page and see advertisement",
  "description": "",
  "id": "player-in-youtube-music;non-login-user-start-a-song-from-home-page-and-see-advertisement",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user open Youtube Music homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user see Music Youtube Home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click the first song in Quick picks section",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user redirected to music video screen",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verify ads is exist",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user verify music video start",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user see autoplay list in the right section of the screen",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user see video control bar in the bottom of the screen",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.openYoutubeMusic()"
});
formatter.result({
  "duration": 4411333375,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateHomePage()"
});
formatter.result({
  "duration": 200347278,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.clickFirstSong()"
});
