package jmasters.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jmasters.spring.config.AppFullConfig;
import jmasters.spring.model.Calculator;
import jmasters.spring.model.PrototypeBean;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppFullConfig.class);

        System.out.println(ctx.getBean("summator", Calculator.class).calculate(1, 2));
        System.out.println(ctx.getBean("stringBean"));
        System.out.println(ctx.getBean(PrototypeBean.class).getNumber());
        System.out.println(ctx.getBean(PrototypeBean.class).getNumber());

        ctx.close();
    }

}
