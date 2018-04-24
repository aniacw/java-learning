package Exe1;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondArray = {15, 17, 100};
        int[] thirdArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Method method = new Method();
        System.out.println(method.showDivisibleNumbers(firstArray));
        System.out.println(method.showDivisibleNumbers(secondArray));
        System.out.println(method.showDivisibleNumbers(thirdArray));
    }
}