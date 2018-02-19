package TextFile;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("FiveWords.txt");
        Scanner scanner = new Scanner(file);

        String theFile = scanner.nextLine();
        System.out.println(theFile);

        String[] theWords = theFile.split(", ");
        for (String theSeparateWords: theWords
             ) {
            System.out.println(theSeparateWords);
        }
    }
}
