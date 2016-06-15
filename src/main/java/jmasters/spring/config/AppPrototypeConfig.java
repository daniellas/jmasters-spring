package jmasters.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jmasters.spring.model.PrototypeBean;

@Configuration
public class AppPrototypeConfig {

    @Bean
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
