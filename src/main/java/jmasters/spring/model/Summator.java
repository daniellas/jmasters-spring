package jmasters.spring.model;

public class Summator implements Calculator {

    private static int counter;

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    public int getCounter() {
        return counter;
    }
}
