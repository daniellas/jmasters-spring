package jmasters.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmasters.spring.config.AppFullConfig;
import jmasters.spring.model.MultipleCalculator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppFullConfig.class)
public class MultipleCalculatorTest {

    @Autowired
    private MultipleCalculator multipleCalculator;

    @Test
    public void allCalculatorsShouldCalculate() {
        int[] result = multipleCalculator.calculate(1, 2);

        Assert.assertEquals(4, result.length);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
    }

}
