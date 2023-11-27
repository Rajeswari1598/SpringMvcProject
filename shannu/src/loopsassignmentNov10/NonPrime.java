package loopsassignmentNov10;

public class NonPrime {
	public static void main(String[] args) {
		NonPrime prime = new NonPrime();
		prime.numberForLoop();
	}

	public void numberForLoop() {
		for(int j=1;j<=100;j++) {
			int count=0;
		for (int i =1; i<=j; i++) {
          if(j%i==0) {
        	 count++; 
          }
		}
		if(count!=2&&count>2){
			System.out.println("Non prime number : "+j);
		}
		}	
	}
    public void numberWhile() {
    	
    }
}
