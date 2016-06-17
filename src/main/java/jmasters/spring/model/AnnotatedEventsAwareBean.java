package jmasters.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedEventsAwareBean {

    @PostConstruct
    public void init() {
        System.out.println("init !!!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy !!!");
    }

}
