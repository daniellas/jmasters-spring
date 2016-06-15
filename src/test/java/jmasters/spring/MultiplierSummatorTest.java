package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppFullConfig;
import jmasters.spring.model.Calculator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppFullConfig.class)
public class MultiplierSummatorTest {

    @Autowired
    private Calculator multiplierSummator;

    @Test
    public void multiplierSummatorShouldBeInjected() {
        Assert.assertNotNull(multiplierSummator);
        System.out.println(multiplierSummator.calculate(1, 2));
    }

}
