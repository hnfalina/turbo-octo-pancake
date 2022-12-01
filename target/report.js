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
  "duration": 5493554647,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateHomePage()"
});
formatter.result({
  "duration": 313890337,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.clickFirstSong()"
});
formatter.result({
  "duration": 2384447651,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateMusicVideoScreen()"
});
formatter.result({
  "duration": 79735398,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateAds()"
});
formatter.result({
  "duration": 41095479,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateMusicVideo()"
});
formatter.result({
  "duration": 14514848972,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateAutoPlay()"
});
formatter.result({
  "duration": 185647644,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateControlBar()"
});
formatter.result({
  "duration": 24738760,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.closeBrowser()"
});
formatter.result({
  "duration": 173788059,
  "status": "passed"
});
formatter.uri("playlist.feature");
formatter.feature({
  "line": 2,
  "name": "Playlist in Youtube Music",
  "description": "\nI want to create a new playlist",
  "id": "playlist-in-youtube-music",
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
  "name": "User can create a new playlist",
  "description": "",
  "id": "playlist-in-youtube-music;user-can-create-a-new-playlist",
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
  "name": "user Hanifa login using user hanifanur.test and password hanifatest",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user go to https://music.youtube.com/library/playlists",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user create a New Playlist",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user verify the new created playlist",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.openYoutubeMusic()"
});
formatter.result({
  "duration": 3782716767,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateHomePage()"
});
formatter.result({
  "duration": 164220415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanifa",
      "offset": 5
    },
    {
      "val": "hanifanur.test",
      "offset": 29
    },
    {
      "val": "hanifatest",
      "offset": 57
    }
  ],
  "location": "BaseSteps.login(String,String,String)"
});
formatter.result({
  "duration": 8310692926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://music.youtube.com/library/playlists",
      "offset": 11
    }
  ],
  "location": "BaseSteps.goToURL(String)"
});
formatter.result({
  "duration": 1551070015,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.tapNewPlaylist()"
});
formatter.result({
  "duration": 1047662788,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.verifyNewPlaylist()"
});
formatter.result({
  "duration": 2470117498,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.closeBrowser()"
});
formatter.result({
  "duration": 165623874,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Search in Youtube Music",
  "description": "\nI want search a song with exact keyword and get result from all sections",
  "id": "search-in-youtube-music",
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
  "name": "User can search music video based on keyword",
  "description": "",
  "id": "search-in-youtube-music;user-can-search-music-video-based-on-keyword",
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
  "name": "user Search song with exact keyword Raisa",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user press Enter",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verify the result page will appear with all sections",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.openYoutubeMusic()"
});
formatter.result({
  "duration": 4045850048,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validateHomePage()"
});
formatter.result({
  "duration": 168200486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raisa",
      "offset": 36
    }
  ],
  "location": "BaseSteps.searchKeyword(String)"
});
formatter.result({
  "duration": 232776137,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.pressEnterKey()"
});
formatter.result({
  "duration": 121682251,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "all",
      "offset": 45
    }
  ],
  "location": "BaseSteps.verifySearchResultPage(String)"
});
formatter.result({
  "duration": 1223493538,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.closeBrowser()"
});
formatter.result({
  "duration": 100723195,
  "status": "passed"
});
});