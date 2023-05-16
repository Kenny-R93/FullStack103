package DAY51;

public abstract class LibraryItem {
    private String title;
    private int releaseYear;

// Constructor
    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Abstract methods
    public abstract String getItemType();


    public abstract String getItemDetails();

}

