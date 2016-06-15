package jmasters.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class MultiplierSummator implements Calculator {

    private final Calculator summator;

    private final Calculator multiplier;

    @Autowired
    public MultiplierSummator(Calculator summator, Calculator multiplier) {
        this.summator = summator;
        this.multiplier = multiplier;
    }

    @Override
    public int calculate(int a, int b) {
        int multiplyResult = multiplier.calculate(a, b);

        return summator.calculate(multiplyResult, multiplyResult);
    }

    @Override
    public int getCounter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNumber() {
        throw new UnsupportedOperationException();
    }

}
