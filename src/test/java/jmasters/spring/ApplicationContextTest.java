package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class ApplicationContextTest {

    @Autowired
    private String stringBean;

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void applicationContextShouldBeAvailable() {
        Assert.assertNotNull(ctx);
    }

    @Test
    public void beanShouldBeAccessibleThroughApplicationContext() {
        String bean = ctx.getBean("stringBean", String.class);

        Assert.assertEquals(bean, stringBean);
    }
}
