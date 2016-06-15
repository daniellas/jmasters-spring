package jmasters.spring.model;

public class Multiplier implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return 0;
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
