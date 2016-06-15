package jmasters.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jmasters.spring.model.PrototypeBean;

@Configuration
@ComponentScan(basePackageClasses = { PrototypeBean.class })
public class AppPrototypeConfig {

}
