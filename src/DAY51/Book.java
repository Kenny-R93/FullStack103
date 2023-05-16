package DAY51;

public class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Item type: " + getItemType() + ", Title: " + getTitle() + ", Release Year: " + getReleaseYear() + ", Author: " + author + ", ISBN: " + ISBN;
    }

}
