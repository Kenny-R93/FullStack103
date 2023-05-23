package DAY56.TakingLibraryManagementFurther;

public class Book {
    private String title;
    private String author;
    private int published;
    private int pages;
    private String category;
    private boolean available;
    private boolean isOnLoan;

    public Book(String title, int published, int pages, String content) {
        this.title = title;
        this.published = published;
        this.pages = pages;
        this.category = category;
        this.available = true;
        this.isOnLoan = false;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return published;
    }

    public void setPublicationYear(int published) {
        this.published = published;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public void setLoanStatus(boolean isOnLoan) {
        this.isOnLoan = isOnLoan;
    }
}
