package jmasters.spring.model;

public class PrototypeBean {

    private static int counter;

    private int number;

    public PrototypeBean() {
        counter++;
        number = counter;
        System.out.println("PrototypeBean konstruktor numer " + counter);
    }

    public int getCounter() {
        return counter;
    }

    public int getNumber() {
        return number;
    }

}
