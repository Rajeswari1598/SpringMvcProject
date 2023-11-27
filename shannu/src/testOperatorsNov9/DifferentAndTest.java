package testOperatorsNov9;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import operatorsNov9day6.DifferentiateAnd;

public class DifferentAndTest {
       DifferentiateAnd object=new DifferentiateAnd();
       @Test
       public void singleAnd() {
    	   boolean result=object.singleAnd(20, 10);
    	   assertFalse(result);
       }
       @Test
       public void doubleAnd() {
    	   boolean result=object.doubleAnd(20, 10);
    	   assertFalse(result);
       }
}
