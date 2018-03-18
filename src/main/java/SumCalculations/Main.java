package SumCalculations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SumCalculations.StaticMethods.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> listOfNumbers = new ArrayList<>();
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);

        String readLine = scanner.nextLine();
        String[] theNumbers = readLine.split(", ");

        for (String number: theNumbers) {
            listOfNumbers.add(Integer.parseInt(number));
        }

        System.out.println(listOfNumbers);

        Sum sumForLoop = new SumStream();
        Integer total = sumForLoop.sum(listOfNumbers);
        System.out.println(total);

        add(listOfNumbers);
        StaticMethods.add(listOfNumbers);

        addInt(4, 5);
        StaticMethods.addInt(3, 7);

        subtract(6, 2);
        StaticMethods.subtract(9,1);

        multiply(2, 8);
        StaticMethods.multiply(3, 4);

        divide(6, 5);
        StaticMethods.divide(9, 2);

        System.out.println(StaticMethods.addInt(2, 8));
    }
}
