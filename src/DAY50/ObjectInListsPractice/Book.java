package DAY50.ObjectInListsPractice;
// Book Assignment
public class Book {
    private String title;

    private int numPages;

    private int publicationYear;

    public Book(String title, int numPages, int publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return this.title + " has " + this.numPages + " pages and was published in " + this.publicationYear;

}

}
