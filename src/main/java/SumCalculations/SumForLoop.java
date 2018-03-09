package SumCalculations;

import java.util.ArrayList;
import java.util.List;

public class SumForLoop implements Sum {

    public List<Integer> sum(){
        Integer sum = 0;
        List<Integer> helpList = new ArrayList<>();
        for(int i = 0; i < helpList.size(); i++){
            Integer currentNumber = helpList.get(i);
            sum += currentNumber;
        }
        return null;
    }
}
