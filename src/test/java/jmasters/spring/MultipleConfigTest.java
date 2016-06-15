package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppFullConfig;
import jmasters.spring.model.Calculator;
import jmasters.spring.model.PrototypeBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppFullConfig.class)
public class MultipleConfigTest {

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private String stringBean;

    @Autowired
    private Calculator summator;

    @Test
    public void allBeansShouldBeInjected() {
        Assert.assertNotNull(prototypeBean);
        Assert.assertNotNull(stringBean);
        Assert.assertNotNull(summator);
    }

}
