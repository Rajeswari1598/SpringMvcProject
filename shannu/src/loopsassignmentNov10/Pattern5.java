package loopsassignmentNov10;

public class Pattern5 {
      public void corenuts() {
    	  for(int i=1;i<=8;i++) {
    		  String value="corenuts";
    		  int rem=0;
    		  for(int j=1;j<=8;j++) {
    			  if(i>=j) {
    			  System.out.print(value.charAt(rem++)); 
    			  }
    		  }
    		  System.out.println();
    	  }
      }
	public static void main(String[] args) {
		Pattern5 pattern=new Pattern5();
           pattern.corenuts();
	}

}
