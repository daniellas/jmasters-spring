package jmasters.spring.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllMultipleCalculator implements MultipleCalculator {

    @Autowired
    List<Calculator> calculators;

    @Override
    public int[] calculate(int a, int b) {
        int[] result = new int[calculators.size()];
        int cnt = 0;

        for (Calculator calculator : calculators) {
            result[cnt] = calculator.calculate(a, b);
            cnt++;
        }
        
        return result;
    }

}
