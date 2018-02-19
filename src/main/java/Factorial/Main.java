package Factorial;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        int result5 = factorialCalculator.calculate(5);
        System.out.println(result5);

        int result10 = factorialCalculator.calculate(10);
        System.out.println(result10);

        int result50 = factorialCalculator.calculate(50);
        System.out.println(result50);

        FactorialCalculatorBigDecimal factorialCalculatorBigDecimal = new FactorialCalculatorBigDecimal(50);

        BigDecimal resultBDCalc =  factorialCalculatorBigDecimal.calculatorBD();
        System.out.println(resultBDCalc);
    }
}
