package GuessTheMovie;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        int index = 0;
        File file = new File("movieList.txt");
        Scanner scanner = new Scanner(file);

//        String theFile = scanner.nextLine();
//        System.out.println(theFile);
        String[] movies = new String[index];

//        String[] movies = theFile.split("\r\n");
//
//        for (String tingleMovies: movies) {
//            System.out.println(tingleMovies);
//        }

        while (scanner.hasNextLine()){
          String movie = scanner.nextLine();
            System.out.println(movie);
            movies[index] = movie;
            index++;
        }

        int randomIndex = new Random().nextInt(movies.length);
        String randomMovie = movies[randomIndex];
        System.out.println(randomMovie);

    }
}
