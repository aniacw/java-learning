package SumCalculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> listOfNumbers = new ArrayList<>();
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);

//        while(scanner.hasNext()){
//            Integer temporaryNumber = scanner.nextInt();
//            listOfNumbers.add(temporaryNumber);
//        }
//        System.out.println(listOfNumbers);

        listOfNumbers.add(5);
        listOfNumbers.add(85);
        listOfNumbers.add(51);
        listOfNumbers.add(96);
        listOfNumbers.add(74);
        listOfNumbers.add(45);
        listOfNumbers.add(8);
        listOfNumbers.add(13);
        listOfNumbers.add(64);
        listOfNumbers.add(33);

        SumForLoop sumForLoop = new SumForLoop();
        List<Integer> total = sumForLoop.sum();
        System.out.println(total);

    }
}
