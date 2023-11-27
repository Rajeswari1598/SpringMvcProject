package testOperatorsNov9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import operatorsNov9day6.RelationalOperator;

public class RelationalTest {
	RelationalOperator operator=new RelationalOperator();
	@Before
	public void before() {
		System.out.println("----before----");
	}

	@Test
	public void lessThan() {
		boolean result=operator.lessThan(10, 20);
		assertTrue(result);	
	}
	@Test
	public void greaterThan() {
		boolean result=operator.lessThan(100, 10);
		//assertTrue(result);	
		assertFalse(result);
	}
	@Test
	public void lessThanEqual() {
		boolean result=operator.lessThanEqual(10, 20);
		  assertTrue(result);	
		//assertFalse(result);
	}
	@Test
	public void greaterThanEqual() {
		boolean result=operator.greaterThanEqual(100, 100);
		assertTrue(result);	
      //assertFalse(result);
	}
	
}
