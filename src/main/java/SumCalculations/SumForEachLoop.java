package SumCalculations;

import java.util.List;

public class SumForEachLoop implements Sum{

    public Integer sum(List<Integer> list){
        Integer sum = 0;
        for (Integer theNumber: list) {
            sum += theNumber;
        }
        return sum;
    }
}
