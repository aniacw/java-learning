package Factorial;

public class FactorialCalculator {
    private int number;

    public FactorialCalculator() {
        this.number = number;
    }

    private int factor = 1;
    public int calculate(int number){
        for(int i = 1; i <= number; i++){
           factor = factor*i;
        }
        return factor;
    }
}
