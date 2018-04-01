package Dictionary2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Hungarian hungarian = new Hungarian();
        System.out.println(hungarian.translate("sernik"));
        German german = new German();
        System.out.println(german.translate("sernik"));
        Slovak slovak = new Slovak();
        System.out.println(slovak.translate("sernik"));
    }
}
