package Exe1;

public class Method {

    public int showDivisibleNumbers(int[] someArray) {
        for (int z = 0; z < someArray.length; z++) {
            if (someArray.length <= 10) {
                if (someArray[z] % 2 == 0)  {
                    return someArray[z];
                }
            } else {
                System.out.println("Incorrect input");
            }
        }
        return Integer.parseInt(null);
    }
}