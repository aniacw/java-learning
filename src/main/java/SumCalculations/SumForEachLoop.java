package SumCalculations;

import java.util.List;

public class SumForEachLoop implements Sum{

    List<Integer> helpListForLoop;
    Integer sum = 0;

    public List<Integer> sum(){
        for (Integer theNumber: helpListForLoop
             ) { sum += theNumber;
        }
        return null;
    }
}
