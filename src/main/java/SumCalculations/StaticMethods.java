package SumCalculations;

import java.util.List;

public class StaticMethods {

    public static Integer add(List<Integer> number){
        Integer sumStatic = 0;
        for(int i = 0; i<number.size(); i++){
            sumStatic += number.get(i);
        }
        return sumStatic;
    }

    public static Integer addInt(Integer number1, Integer number2){
        return number1 + number2;
    }

    public static Integer subtract(Integer number1, Integer number2){
        return number1 - number2;
    }

    public static Integer multiply(Integer number1, Integer number2){
        return number1 * number2;
    }

    public static Double divide(Integer number1, Integer number2){
        return Double.valueOf(number1 / number2);
    }
}
