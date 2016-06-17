package jmasters.spring.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigurableBean {

    @Autowired
    private Environment env;

    @PostConstruct
    public void init() {
        System.out.println(env.getProperty("string"));
        System.out.println(env.getProperty("int", Integer.class));
        System.out.println(env.getProperty("number", Float.class));
    }
}
