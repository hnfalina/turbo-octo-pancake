package helper.data;

public class HelperData {
    private static String keyword;
    private static String playlistTitle;
    private static String playListPrivacy;

    public static void setKeyword(String keyword) {
        HelperData.keyword = keyword;
    }

    public static String getKeyword() {
        return keyword;
    }

    public static void setPlaylistTitle(String playlistTitle) {
        HelperData.playlistTitle = playlistTitle;
    }

    public static String getPlaylistTitle() {
        return playlistTitle;
    }

    public static void setPlayListPrivacy(String playListPrivacy) {
        HelperData.playListPrivacy = playListPrivacy;
    }

    public static String getPlayListPrivacy() {
        return playListPrivacy;
    }
}
