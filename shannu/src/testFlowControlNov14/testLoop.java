package testFlowControlNov14;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flowControlsNov14.flowControlLoops;

public class testLoop {
      flowControlLoops loops=new flowControlLoops();
      @BeforeEach
    	public void beforeeach() {
    		System.out.println("----before----");
    	}
        @AfterEach
        public void aftereach() {
      		System.out.println("----after----");
      	}
      @Test
      public void loop1() {
      loops.flowLoop();
      }
      @Ignore      
      @Test
      public void loop2() {
    	  loops.flowLoop1();
      }
      @Test
      public void loop3() {
    	  loops.flowLoop2();
      }
      @Test
      public void loop4() {
    	  loops.flowObject();
      }
    
}
