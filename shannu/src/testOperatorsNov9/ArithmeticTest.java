package testOperatorsNov9;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import operatorsNov9day6.ArithmeticOperator;

public class ArithmeticTest {
      ArithmeticOperator operator=new ArithmeticOperator();
      @Test
      public void additionTest() {
    	  int result=operator.addition(10,100);
		assertEquals(130,result);	  
      }
      @Test
      public void substractionTst() {
    	 int result= operator.substraction(10, 100);
    	 assertEquals(-70, result);
      }
      @Test
      public void multiplicationTest(){
    	  int result=operator.multiplication(10, 20);
    	  assertNotEquals(30, result);  
      }
      @Test
      public void divisionTest(){
    	  int result=operator.division(40, 20);
//    	  assertNotEquals(30, result);
    	  assertEquals(22, result);  
      }
      @Test
      public void modulusTest() {
    	  int result=operator.modulus(10,100);
		assertEquals(10,result);	  
      }
}
