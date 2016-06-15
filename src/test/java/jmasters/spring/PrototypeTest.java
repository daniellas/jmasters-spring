package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppPrototypeConfig;
import jmasters.spring.model.PrototypeBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppPrototypeConfig.class })
public class PrototypeTest {

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    @Qualifier("prototypeBean")
    private PrototypeBean nextPrototypeBean;

    @Test
    public void prototypeBeansShouldBeInjected() {
        Assert.assertNotNull(prototypeBean);
        Assert.assertNotNull(nextPrototypeBean);
    }

    @Test
    public void prototypeBeansShouldBeDifferent() {
        Assert.assertNotEquals(prototypeBean, nextPrototypeBean);
    }

    @Test
    public void prototypeBeansShouldHaveCorrectNumbers() {
        Assert.assertEquals(1, prototypeBean.getNumber());
        System.out.println(prototypeBean.getNumber());
        Assert.assertEquals(2, nextPrototypeBean.getNumber());
        System.out.println(nextPrototypeBean.getNumber());
    }

    @Test
    public void prototypeBeansCounterShouldBeTwo() {
        Assert.assertEquals(2, nextPrototypeBean.getCounter());
        System.out.println(prototypeBean.getCounter());
        Assert.assertEquals(2, nextPrototypeBean.getCounter());
        System.out.println(nextPrototypeBean.getCounter());
    }

}
