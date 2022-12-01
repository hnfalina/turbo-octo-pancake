package helper.pages;

import helper.data.HelperData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BasePage{

    WebDriver driver;
    WebDriverWait wait;
    WebDriverWait longwait;
    JavascriptExecutor js;

    String homeMenu = "//*[@tab-id='FEmusic_home']";
    String searchButton = "//ytmusic-search-box";
    String searchTextField = "//input[@placeholder='Search']";
    String topResultSectionTitle = "//*[text()='Top result']";
    String songsSectionTitle = "//*[text()='Songs']";
    String videosSectionTitle = "//*[text()='Videos']";
    String albumsSectionTitle = "//*[text()='Albums']";
    String communityPlaylistsSectionTitle = "//*[text()='Community playlists']";
    String artistsSectionTitle = "//*[text()='Artists']";
    String quickPicksTitle = "//*[text()='Quick picks']";
    String firstSong = "(//*[contains(@class,'left-items style-scope ytmusic-responsive-list-item-renderer')])[1]";
    String signInButton = "//*[contains(@class,'sign-in-link style-scope ytmusic-nav-bar')]";
    String emailTextField = "//input[@type='email']";
    String passwordTextField = "//input[@type='password']";
    String playlistBaruButton = "//*[text()='Playlist baru']";
    String popupNewPlayListForm = "//*[text()='Playlist baru' and contains(@class,'form-title style-scope ytmusic-playlist-form')]";
    String playListTitleTextField = "(//*[contains(@aria-describedby,'paper-input-add-on-1')])[1]";
    String playListPrivacyDropdown = "(//*[contains(@id,'menuButton')])[2]";
    String playListTitle = "(//*[contains(@class,'title style-scope ytmusic-detail-header-renderer')])[1]";
    String playListPrivacy = "(//*[contains(@class,'style-scope yt-formatted-string')])[1]";

    WebElement homeMenuElement;
    WebElement searchButtonElement;
    WebElement searchTextFieldElement;
    WebElement topResultSectionTitleElement;
    WebElement songsSectionTitleElement;
    WebElement videosSectionTitleElement;
    WebElement albumsSectionTitleElement;
    WebElement communityPlaylistsSectionTitleElement;
    WebElement artistsSectionTitleElement;
    WebElement songTitleElement;
    WebElement songSortDescElement;
    WebElement songButtonElement;
    WebElement videoButtonElement;
    WebElement albumsButtonElement;
    WebElement albumSortDescElement;
    WebElement communityPlaylistButtonElement;
    WebElement artistsButtonElement;
    WebElement quickPicksTitleElement;
    WebElement firstSongElement;
    WebElement signInButtonElement;
    WebElement emailTextFieldElement;
    WebElement passwordTextFieldElement;
    WebElement playlistBaruButtonElement;
    WebElement playListTitleTextFieldElement;
    WebElement playListPrivacyDropdownElement;
    WebElement playListPrivacyTextElement;
    WebElement buatButtonElement;

    public void openYoutubeHomePage() {
        setup();
    }

    public void validateHomePageElement() {
        homeMenuElement = driver.findElement(By.xpath(homeMenu));
        searchButtonElement = driver.findElement(By.xpath(searchButton));

        isElementExist(homeMenuElement);
        isElementExist(searchButtonElement);
    }

    public void login(String name, String user, String pass) {
        signInButtonElement = driver.findElement(By.xpath(signInButton));
        signInButtonElement.click();

        emailTextFieldElement = driver.findElement(By.xpath(emailTextField));
        emailTextFieldElement.click();
        emailTextFieldElement.sendKeys(user+"@gmail.com");
        pressEnter();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
        passwordTextFieldElement = driver.findElement(By.xpath(passwordTextField));
        passwordTextFieldElement.click();
        passwordTextFieldElement.sendKeys(pass);
        pressEnter();

        wait.until(ExpectedConditions.invisibilityOf(signInButtonElement));
        wait.until(ExpectedConditions.urlToBe("https://music.youtube.com/"));
    }

    public void goToURL(String url) {
        driver.navigate().to(url);
    }

    public void tapNewPlayList() {
        playlistBaruButtonElement = driver.findElement(By.xpath(playlistBaruButton));
        playlistBaruButtonElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popupNewPlayListForm)));
    }

    public void inputPlaylistTitle() {
        Random rand = new Random();
        int upperbound = 10000;
        int int_random = rand.nextInt(upperbound);
        String randomTitle = "Playlist " + int_random;

        HelperData.setPlaylistTitle(randomTitle);

        playListTitleTextFieldElement = driver.findElement(By.xpath(playListTitleTextField));
        wait.until(ExpectedConditions.visibilityOf(playListTitleTextFieldElement));
        playListTitleTextFieldElement.click();
        playListTitleTextFieldElement.sendKeys(randomTitle);
    }

    public void choosePlaylistPrivacy() {
        String[] privacyOption = { "Publik", "Tidak publik", "Pribadi" };
        List<String> tabList = Arrays.asList(privacyOption);

        String privacy = tabList.get(new Random().nextInt(tabList.size()));

        HelperData.setPlayListPrivacy(privacy);

        playListPrivacyDropdownElement = driver.findElement(By.xpath(playListPrivacyDropdown));
        playListPrivacyDropdownElement.click();

        playListPrivacyTextElement = driver.findElement(By.xpath("//*[text()='"+privacy+"']"));
        playListPrivacyTextElement.click();
    }

    public void clickBuat() {
        buatButtonElement = driver.findElement(By.xpath("(//*[@aria-label='Buat'])"));
        buatButtonElement.click();
    }

    public void verifyPlaylistTitle() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(playListTitle),HelperData.getPlaylistTitle()));
    }

    public void verifyPlaylistPrivacy() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(playListPrivacy),HelperData.getPlayListPrivacy()));
    }

    public void verifySongRecommendation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Saran']")));
    }

    public void clickSearchButton() {
        searchButtonElement = driver.findElement(By.xpath(searchButton));
        searchButtonElement.click();
    }

    public void inputSearchKeyword(String keyword) {
        HelperData.setKeyword(keyword);
        searchTextFieldElement = driver.findElement(By.xpath(searchTextField));

        searchTextFieldElement.click();
        searchTextFieldElement.sendKeys(keyword);
    }

    public void pressEnter() {
        if (isElementExist(searchTextFieldElement)) {
            searchTextFieldElement.sendKeys(Keys.ENTER);
        } else if (isElementExist(passwordTextFieldElement)) {
            passwordTextFieldElement.sendKeys(Keys.ENTER);
        } else {
            emailTextFieldElement.sendKeys(Keys.ENTER);
        }
    }

    public void verifySearchResultPageSection(String section) {
        String keyword = HelperData.getKeyword();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(topResultSectionTitle)));

        switch(section) {
            case "all":
                verifyTopResultSection(keyword);
                verifySongsSection(keyword);
                verifyVideos();
                verifyAlbums(keyword);
                verifyCommunityPlaylists();
                verifyArtists();
            case "top result":
                verifyTopResultSection(keyword);
            case "songs":
                verifySongsSection(keyword);
            case "videos":
                verifyVideos();
            case "albums":
                verifyAlbums(keyword);
            case "community playlists":
                verifyCommunityPlaylists();
            case "artists":
                verifyArtists();
        }
    }

    public void verifyTopResultSection(String key) {
        topResultSectionTitleElement = driver.findElement(By.xpath(topResultSectionTitle));
        isElementExist(topResultSectionTitleElement);

        String songTitle = "//*[@title='"+ key +"']";
        songTitleElement = driver.findElement(By.xpath(songTitle));
    }

    public void verifySongsSection(String key) {
        songsSectionTitleElement = driver.findElement(By.xpath(songsSectionTitle));
        isElementExist(songsSectionTitleElement);

        String songSortDesc = "//*[contains(@title,'Song • "+ key +"')]";
        String songButton = "//*[@title='Show song results']";
        songSortDescElement = driver.findElement(By.xpath(songSortDesc));
        songButtonElement = driver.findElement(By.xpath(songButton));
    }

    public void verifyVideos() {
        videosSectionTitleElement = driver.findElement(By.xpath(videosSectionTitle));
        isElementExist(videosSectionTitleElement);

        String videoButton = "//*[@title='Show video results']";
        videoButtonElement = driver.findElement(By.xpath(videoButton));
    }

    public void verifyAlbums(String key) {
        albumsSectionTitleElement = driver.findElement(By.xpath(albumsSectionTitle));
        isElementExist(albumsSectionTitleElement);

        String albumSortDesc = "//*[contains(@title,'Album • "+ key +"')]";
        String albumsButton = "//*[@title='Show album results']";
        albumSortDescElement = driver.findElement(By.xpath(albumSortDesc));
        albumsButtonElement = driver.findElement(By.xpath(albumsButton));
    }

    public void verifyCommunityPlaylists() {
        communityPlaylistsSectionTitleElement = driver.findElement(By.xpath(communityPlaylistsSectionTitle));
        isElementExist(communityPlaylistsSectionTitleElement);

        String communityPlaylistButton = "//*[@title='Show community playlist results']";
        communityPlaylistButtonElement = driver.findElement(By.xpath(communityPlaylistButton));
    }

    public void verifyArtists() {
        artistsSectionTitleElement = driver.findElement(By.xpath(artistsSectionTitle));
        isElementExist(artistsSectionTitleElement);

        String artistsButton = "//*[@title='Show artist results']";
        artistsButtonElement = driver.findElement(By.xpath(artistsButton));
    }

    public void clickFirstSongInQuickPicks() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(quickPicksTitle)));
        quickPicksTitleElement = driver.findElement(By.xpath(quickPicksTitle));
        js.executeScript("arguments[0].scrollIntoView();", quickPicksTitleElement);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstSong)));
        firstSongElement = driver.findElement(By.xpath(firstSong));
        firstSongElement.click();
    }

    public void validatePlayerScreen() {
        isElementExist(driver.findElement(By.className("ytp-ad-text")));
    }

    public void verifyAds() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ytp-ad-player-overlay")));
        isElementExist(driver.findElement(By.className("ytp-ad-player-overlay")));
    }

    public void musicVideoStart() {
        longwait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("ytp-ad-player-overlay"))));
        isElementExist(driver.findElement(By.id("song-image")));
    }

    public void validateTabs() {
        isElementExistById("tabsContent");
    }

    public void validateControlBar() {
        isElementExistById("player-bar-background");
    }

    public boolean isElementExist(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception var4) {
            System.out.println("Element with locator : " + element + " is not present!");
            return false;
        }
    }

    public void isElementExistById(String id) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        } catch (Exception var4) {
            System.out.println("Element with id : " + id + " is not present!");
        }
    }

    public void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
    }

    public void setup() {
        setupWebdriverChromeDriver();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        longwait = new WebDriverWait(driver, 30);
        js = (JavascriptExecutor) driver;
        driver.get("https://music.youtube.com/");
        driver.manage().window().maximize();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
