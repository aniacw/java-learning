package Factorial;

import java.math.BigDecimal;

public class FactorialCalculatorBigDecimal {

    private BigDecimal bigDecimalNumber;

    public FactorialCalculatorBigDecimal(Integer bigDecimalNumber) {
        this.bigDecimalNumber = new BigDecimal(bigDecimalNumber);
    }

    public BigDecimal calculatorBD(){
        BigDecimal end = BigDecimal.valueOf(5);
        BigDecimal result = BigDecimal.valueOf(1);
        for(BigDecimal i = BigDecimal.ONE; i.compareTo(end) < 0; i = i.add(BigDecimal.ONE)){
            result = result.multiply(i);
        }
        return result;
    }
}
