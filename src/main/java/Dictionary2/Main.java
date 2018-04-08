package Dictionary2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Please type the language...");
        Scanner in = new Scanner(System.in);
        String language = in.next();

        System.out.println("Please type the word...");
        Scanner inWord = new Scanner(System.in);
        String typedWord = inWord.next();

        Hungarian hungarian = new Hungarian();
        German german = new German();
        Slovak slovak = new Slovak();

        if(language.equals("Hungarian")){
            System.out.println("Translation: " + hungarian.translate(typedWord));
        }
        if(language.equals("German")){
            System.out.println("Translation: " +german.translate(typedWord));
        }
        if(language.equals("Slovak")){
            System.out.println("Translation: " +slovak.translate(typedWord));
        }
    }
}
