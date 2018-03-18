package SumCalculations;

import java.util.List;

public final class SumStream implements Sum{

    public Integer sum(List<Integer> list){
        return list.stream()
                .mapToInt(number -> number.intValue())//zamienia typy
                .sum();
    }
}
