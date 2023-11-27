package testOperatorsNov9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import operatorsNov9day6.MiscellaneousOperator;

public class miscTest {

	MiscellaneousOperator operator=new MiscellaneousOperator();
	@Test
	public void ternaryOperator() {
		String result=operator.condition(20, 100);
		assertEquals("less",result);	
	}
	@Test
	public void instanceOf() {
		boolean result=operator.instanceOfString("raji");
		assertTrue(result);
			
	}
	
}
