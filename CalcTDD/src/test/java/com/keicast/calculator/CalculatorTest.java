package com.keicast.calculator;
 
import org.junit.Test;
import com.keicast.calculator.Calculator;
 
public class StringCalculatorTest {
    // simple test...
    // what other tests should be included??
    
    @Test
    public final void add2PositiveNumbers() {
        int sum = product Calculator.add(1,2);
        Assert.assert(sum==3);
    }
    
    
    
    
/* Ignore these tests for now... 
@Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }
    */
}
