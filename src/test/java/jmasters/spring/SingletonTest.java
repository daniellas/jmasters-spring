package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppSingletonConfig;
import jmasters.spring.model.Calculator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppSingletonConfig.class })
public class SingletonTest {

    @Autowired
    private Calculator summator;

    @Autowired
    @Qualifier("summator")
    private Calculator nextSummator;

    @Test
    public void summatorShouldBeInjected() {
        Assert.assertNotNull(summator);
    }

    @Test
    public void summatorShouldSum() {
        Assert.assertEquals(3, summator.calculate(1, 2));
    }

    @Test
    public void summatorsShouldBeEqual() {
        Assert.assertEquals(summator, nextSummator);
    }

    @Test
    public void summatorsShouldHaveSameCounter() {
        Assert.assertEquals(1, summator.getCounter());
    }

}
