package jmasters.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jmasters.spring.model.Calculator;
import jmasters.spring.model.Summator;

@Configuration
public class AppSingletonConfig {

    @Bean
    public Calculator summator() {
        return new Summator();
    }

}
