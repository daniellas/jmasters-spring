package jmasters.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jmasters.spring.model.Calculator;
import jmasters.spring.model.MultiplierSummator;

@Configuration
public class AppMultiplierSummatorConfig {

    @Autowired
    private Calculator multiplier;

    @Autowired
    private Calculator summator;

    @Bean
    public Calculator multiplierSummator() {
        return new MultiplierSummator(summator, multiplier);
    }
}
