package DAY51;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> myLibraryApp = new LibraryManager<>();

        Book book1 = new Book("A Dance with Dragons", 2011, "George R.R Martin", "AB9780553582017");

        DVD dvd1 = new DVD("Guardians of the Galaxy Vol. 3", 2023, "James Gunn", 149);

        myLibraryApp.addItem(book1);
        myLibraryApp.addItem(dvd1);

        myLibraryApp.displayItems();
        myLibraryApp.removeItem(book1);


    }

}
