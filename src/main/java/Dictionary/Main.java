package Dictionary;

public class Main {
    public static void main(String[] args){

        Dictionary dictionary = DictionaryFactory.getTranslation("English");
        System.out.println(dictionary.translate("sernik"));
        Dictionary dictionary1 = DictionaryFactory.getTranslation("Spanish");
        System.out.println(dictionary1.translate("sernik"));
        Dictionary dictionary2 = DictionaryFactory.getTranslation("Italian");
        System.out.println(dictionary2.translate("sernik"));
        Dictionary dictionary3 = DictionaryFactory.getTranslation("Japanese");
        System.out.println(dictionary3.translate("sernik"));
    }
}
