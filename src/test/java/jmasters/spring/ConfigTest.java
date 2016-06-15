package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class ConfigTest {

    @Autowired
    private String stringBean;

    @Test
    public void stringBeanShouldBeInjected() {
        Assert.assertEquals("Jestem beanem typu java.lang.String", stringBean);
        System.out.println(stringBean);
    }
}
