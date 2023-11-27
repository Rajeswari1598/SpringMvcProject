package loopsassignmentNov10;

public class SumAverageOneToHundred {
	public void sumAverage() {
		int sum=0,average=1;double rem=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		    rem=sum/average;
			average++;
		}
		System.out.println(sum);
		System.out.println(rem);
	}

	public static void main(String[] args) {
		SumAverageOneToHundred numbers=new SumAverageOneToHundred();
		numbers.sumAverage();

	}

}
