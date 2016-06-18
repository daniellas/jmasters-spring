package jmasters.spring.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    private static int counter;
    private int number;

    public PrototypeBean() {
        counter++;
        number = counter;
        System.out.println("PrototypeBean konstruktor numer " + number);
    }

    public int getCounter() {
        return counter;
    }

    public int getNumber() {
        return number;
    }

}
