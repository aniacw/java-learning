package SumCalculations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    }
}
