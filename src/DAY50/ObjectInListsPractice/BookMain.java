package DAY50.ObjectInListsPractice;

import java.util.Enumeration;
import java.util.Scanner;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        System.out.println("Library of Books: \n" + "Entering nothing will stop the loop");

        while(true) {
            System.out.println("Search for book:");
            String title = scanner.nextLine();

            if(title.isEmpty()) {
                break;

            }

            System.out.println("How many pages are in the book?");
            int numPages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Publication year?");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();


            Book newbook = new Book(title, publicationYear, numPages);
            bookList.add(newbook);

        }

        System.out.println(" What information will be printed? (Options: title, publication year, or everything)");
        String printInput = scanner.nextLine();

        if( printInput.equals("title")) {
            for (Book newbook: bookList) {
                if(newbook != null) {
                    System.out.println(newbook.getTitle());

                } else if (printInput.equals("everything")) {
                    for (Book newBook: bookList) {
                        if(newbook != null){
                            System.out.println(newbook.toString());
                        }
                    }
                }

            }

        }
    }
}
