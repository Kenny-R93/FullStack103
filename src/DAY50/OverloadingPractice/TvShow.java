package DAY50.OverloadingPractice;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Name of the show is " + showName + " and number of episodes is " + numberOfEpisodes + " and genre is " + genre;
    }


}