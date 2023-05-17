package DAY50.OverloadingPractice;

import java.util.ArrayList;
import java.util.Scanner;
public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> enterTVshows = new ArrayList<>();

        while (true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes? ");

            int numberOfEpisodes = Integer.valueOf(scanner.nextLine());


            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            enterTVshows.add(new TvShow(showName, numberOfEpisodes, genre));

        }

        for (TvShow omg : enterTVshows) {
            System.out.println(omg);
        }
    }
}