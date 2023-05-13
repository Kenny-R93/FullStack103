package DAY50.ObjectInListsPractice;
// TvShow Assignment

public class TvShow {

    private String showName;

    private int numberEpisodes;

    private String genre;

    public TvShow(String showName, int numberEpisodes, String genre) {
        this.showName = showName;
        this.numberEpisodes = numberEpisodes;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberEpisodes() {
        return numberEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString(){
        return ("The name of the show is " + this.showName + " with " + this.numberEpisodes + " number of episdoes. The genre is " + this.genre);

    }
}
