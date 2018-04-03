package GuessTheMovie;

public class Game  {

public static String replaceCharAt(String word, int pos, char x){
    return word.substring(0, pos) + x + word.substring(pos + 1);
}

}
