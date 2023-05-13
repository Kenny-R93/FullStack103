package DAY50.ObjectInListsPractice;
// TvShow Assignment

import java.util.Scanner;

import java.util.ArrayList;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShowList = new ArrayList<>();
        System.out.println("TV Shows: \n" + "Entering nothing will stop the loop");

        while(true) {
            System.out.println("Name of the show:");
            String showName = scanner.nextLine();

            if(showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int numberEpisodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numberEpisodes, genre);
            tvShowList.add(tvShow);

        }

        for(TvShow tvShow: tvShow) {
            System.out.println(tvShow.toString());
        }
    }
}
