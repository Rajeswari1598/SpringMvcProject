package generalThingsToJava;

import java.security.DomainCombiner;
import java.util.Random;
import java.util.Scanner;

public class OneTimePassword {
//	public static void main(String[] args) {
//		Random random=new Random();
//		int result=0;
//		int index=0;
//		while(index<7) {
//		 int result1=random.nextInt(10);
//		 if(result1!=0);
//		 if(result1>=0&&result1<=10) {
//			 System.out.println("000"+result1);
//		 }
//		 else if(result1>=10&&result1<=100) {
//			 System.out.println("00"+result1);
//		 }
//		 else if(result1>=100&&result1<=1000) {
//			 System.out.println("0"+result1);
//		 }
//		 else {
//			 System.out.println("it does not match");
//		 }
//		 result=result1;
//		 index++;
//		 
//		}
//	}
//public void randomOtp() {
//	Random random=new Random();
//	String otp="";
//	for(int index=1;index<=4;index++) {
//		int value=random.nextInt(10);
//		otp=otp+value;
//	}
//	System.out.println(otp);
//}
public static void main(String[] args) {
	OneTimePassword test=new OneTimePassword();
//	test.randomOtp();
	test.random();
}
	public void random() {
		Random random=new Random();
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
		System.out.print(random.nextInt(10));
	}
}
