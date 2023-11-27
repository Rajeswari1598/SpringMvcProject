package testOperatorsNov9;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import operatorsNov9day6.IncrementDecrement;

public class IncreDecreTest {
  IncrementDecrement operator=new IncrementDecrement();
  @BeforeEach
  public void beforeEach() {
	  System.out.println("-------before----");
  }
  @Test
  public void preIncreTest() {
	  int result=operator.preIncrement(10,15);
	  assertEquals(27, result);
  }
  @Test
  public void postIncreTest() {
	  int result=operator.postIncrement(20,25);
	  assertEquals(45, result);
  }
  @Test
  public void preDecreTest() {
	  int result=operator.preDecrement(9,12);
	  assertEquals(19, result);
  }
  @Test
  public void postDecreTest() {
	  int result=operator.postDecrement(10,15);
	  assertEquals(25, result);
  }
}
