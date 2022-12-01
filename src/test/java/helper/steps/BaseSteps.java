package helper.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import helper.pages.BasePage;

public class BaseSteps {

    BasePage basePage = new BasePage();

    @Given("^user open Youtube Music homepage$")
    public void openYoutubeMusic() {
        basePage.openYoutubeHomePage();
    }

    @And("^user see Music Youtube Home page$")
    public void validateHomePage() {
        basePage.validateHomePageElement();
    }

    @And("^user (.*?) login using user (.*?) and password (.*?)$")
    public void login(String name, String username, String password) {
        basePage.login(name, username,password);
    }

    @And("^user go to (.*?)$")
    public void goToURL(String url) {
        basePage.goToURL(url);
    }

    @When("^user create a New Playlist$")
    public void tapNewPlaylist() {
        basePage.tapNewPlayList();
        basePage.inputPlaylistTitle();
        basePage.choosePlaylistPrivacy();
        basePage.clickBuat();
    }

    @And("^user verify the new created playlist$")
    public void verifyNewPlaylist() {
        basePage.verifyPlaylistTitle();
        basePage.verifyPlaylistPrivacy();
        basePage.verifySongRecommendation();
    }

    @When("^user Search song with exact keyword (.*?)$")
    public void searchKeyword(String keyword) {
        basePage.clickSearchButton();
        basePage.inputSearchKeyword(keyword);
    }

    @And("^user press Enter$")
    public void pressEnterKey() {
        basePage.pressEnter();
    }

    @Then("^user verify the result page will appear with (.*?) sections$")
    public void verifySearchResultPage(String sections) {
        basePage.verifySearchResultPageSection(sections);
    }

    @When("^user click the first song in Quick picks section$")
    public void clickFirstSong() {
        basePage.clickFirstSongInQuickPicks();
        basePage.verifyAds();
    }

    @Then("^user redirected to music video screen$")
    public void validateMusicVideoScreen() {
        basePage.validatePlayerScreen();
    }

    @And("^user verify ads is exist$")
    public void validateAds() {
        basePage.verifyAds();
    }

    @And("^user verify music video start$")
    public void validateMusicVideo() {
        basePage.musicVideoStart();
    }

    @And("^user see autoplay list in the right section of the screen$")
    public void validateAutoPlay() {
        basePage.validateTabs();
    }

    @And("^user see video control bar in the bottom of the screen$")
    public void validateControlBar() {
        basePage.validateControlBar();
    }

    @And("^user close browser$")
    public void closeBrowser() {
        basePage.teardown();
    }
}
