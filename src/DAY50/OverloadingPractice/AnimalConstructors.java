package DAY50.OverloadingPractice;

public class AnimalConstructors {
    public static void main(String[] args) {
        Animal myAnimal = new Animal ("max", true);
        Book mybooks = new Book ("Book Title", 100, 2023);
        TvShow myTvShows = new TvShow ("Breaking Bad", 100, "Crime");

        System.out.println(myAnimal);
        System.out.println(mybooks);
        System.out.println(myTvShows);
    }
}