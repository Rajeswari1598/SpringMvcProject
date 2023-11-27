package testOperatorsNov9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import operatorsNov9day6.LogicalOperators;

public class LogicalTest {
	LogicalOperators operator=new LogicalOperators();
	@Test
    public void andTest() {
    boolean	result=operator.and(10, 10);
    assertTrue(result);
    }
	@Test
    public void orTest() {
    boolean	result=operator.and(20,20);
    assertTrue(result);
    }
	@Test
    public void notTest() {
    boolean	result=operator.and(20,10);
    //assertTrue(result);
    assertFalse(result);
    }
}
