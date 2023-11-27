package loopsassignmentNov10;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		Random random=new Random();
		int index=1;
		int result=0;
		while(index>0) {
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
		}
	}

}
