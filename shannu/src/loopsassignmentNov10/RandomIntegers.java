package loopsassignmentNov10;

import java.util.Random;

public class RandomIntegers {

	public static void main(String[] args) {
		Random random=new Random();
		int result=0;
		int index=0;
		while(index<=25) {
		 int result1=random.nextInt(100);
		 if(result1>result) {
			 System.out.println("it is a larger value");
		 }
		 else if(result1<result) {
			 System.out.println("it is a smaller value");
		 }
		 else {
			 System.out.println("it is a equal value");
		 }
		 result=result1;
		 index++;
		}
	}

}
