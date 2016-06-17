package jmasters.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class EventsAwareBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("BEFORE DESTROY!!!");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AFTER CONSTRUCT!!!");
    }

}
