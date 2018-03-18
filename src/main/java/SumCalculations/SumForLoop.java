package SumCalculations;

import java.util.List;

public class SumForLoop implements Sum {

    public Integer sum(List<Integer> list){
        Integer sum = 0;
        for(int i = 0; i < list.size(); i++){
            Integer currentNumber = list.get(i);
            sum += currentNumber;
        }
        return sum;
    }
}
