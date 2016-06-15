package jmasters.spring.model;

public class Summator implements Calculator {

    private static int counter;

    private int number;

    public Summator() {
        counter++;
        number = counter;
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
