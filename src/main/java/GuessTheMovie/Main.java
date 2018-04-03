package GuessTheMovie;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("movieList.txt");
        Scanner scanner = new Scanner(file);
        List<String> theMoviesList = new ArrayList<>();

        while (scanner.hasNext()) {
            theMoviesList.add(scanner.nextLine());
        }

        Random random = new Random();
        String randomMovie = theMoviesList.get(random.nextInt(theMoviesList.size()));
        System.out.println(randomMovie);

        String mysteriousMovie = randomMovie.replaceAll(".", "_");

        System.out.println(mysteriousMovie);

        System.out.println("Guess the letter:");
        Scanner in = new Scanner(System.in);
        String letter = in.next();

        String guessInProgress = null;

        for (int n = 0; n < randomMovie.length(); n++) {
            if (letter.equals(randomMovie.indexOf(n))) {
                guessInProgress = mysteriousMovie.replace(String.valueOf(mysteriousMovie.indexOf(n)), letter);
                System.out.println(guessInProgress);
            }
        }
    }
}
