package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppPrototypeConfig;
import jmasters.spring.model.PrototypeBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppPrototypeConfig.class })
public class PrototypeTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void everyPrototypeBeanShouldCreateNewOne() {
        PrototypeBean bean1 = ctx.getBean(PrototypeBean.class);
        PrototypeBean bean2 = ctx.getBean(PrototypeBean.class);
        PrototypeBean bean3 = ctx.getBean(PrototypeBean.class);

        Assert.assertEquals(1, bean1.getNumber());
        Assert.assertEquals(2, bean2.getNumber());
        Assert.assertEquals(3, bean3.getNumber());
    }

}
