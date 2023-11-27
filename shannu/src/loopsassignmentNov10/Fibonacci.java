package loopsassignmentNov10;

public class Fibonacci {
	public void fibonacci() {
		int average=1,sum=0;
		int index1=0;
		int index2=1;
		int index3=0;
		System.out.print(index1+",");
		System.out.print(index2+",");
		for(int index=1;index<20;index++) {
		    index3=index1+index2;
			System.out.print(index3+",");
			sum=sum+index3;
			index1=index2;
			index2=index3;
			average++;
		}
		System.out.println();
		double rem=(sum)/average;
		System.out.println("the average value :"+rem);
		
	}

	public static void main(String[] args) {
		Fibonacci fib=new Fibonacci();
		fib.fibonacci();
	}

}
