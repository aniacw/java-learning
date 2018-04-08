package App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please select the operating system...");
        Scanner in = new Scanner(System.in);
        String input = in.next();

        App.AppBuilder.appBuilder()
                .withName("Messenger")
                .withVersion(10)
               // .withSystemName(SystemFactory.getOS(input).select())
                .build();
    }
}
