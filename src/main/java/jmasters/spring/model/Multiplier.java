package jmasters.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Multiplier implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a * b;
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
