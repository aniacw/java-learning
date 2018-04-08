package Dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Please select the language...");
        Scanner in = new Scanner(System.in);
        String typedLanguage = in.next();

        Dictionary dictionary = DictionaryFactory.getTranslation(typedLanguage);

        System.out.println("Please type the word...");
        Scanner inWord = new Scanner(System.in);
        String typedWord = inWord.next();

        System.out.println("Translation : " + dictionary.translate(typedWord));
    }
}
