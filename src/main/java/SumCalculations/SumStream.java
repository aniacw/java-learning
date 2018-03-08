package SumCalculations;

import java.util.ArrayList;
import java.util.List;

public final class SumStream implements Sum{

    private final List<Integer> listForStream = new ArrayList<>();

    public List<Integer> sum(){
        return listForStream.stream()
                .forEach(number -> number.);


    }
}
