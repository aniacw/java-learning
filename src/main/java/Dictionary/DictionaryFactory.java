package Dictionary;

public class DictionaryFactory {

    public static Dictionary getTranslation(String language){
        if(language == null){
            return null;
        }
        if(language.equals("English")){
            return new English();
        }
        if(language.equals("Italian")){
            return new Italian();
        }
        if(language.equals("Spanish")){
            return new Spanish();
        }
        if(language.equals("Japanese")){
            return new Japanese();
        }
        return null;
    }
}
