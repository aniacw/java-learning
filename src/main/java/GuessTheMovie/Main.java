package GuessTheMovie;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        File file = new File("movieList.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
          String movie = scanner.nextLine();
            System.out.println(movie);
        }


        Random random = new Random();


    }
}
