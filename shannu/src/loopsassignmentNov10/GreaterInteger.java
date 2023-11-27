package loopsassignmentNov10;

import java.util.Scanner;

public class GreaterInteger {
	public static void main(String[] args) {
        GreaterInteger integer=new GreaterInteger();
        integer.geaterInt();
	}
	public void geaterInt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first value");
		int a=sc.nextInt();
		if(a>0) {
			int j=a;
		}
		System.out.println("please enter the second value");
        int b=sc.nextInt();
        if(b>0) {
			int k=a;
		}
        System.out.println("please enter the third number");
        int c=sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("The largest number is"+a);
		}
		else if((b>c)&&(b>a)) {
			System.out.println("The largest number is"+b);
		}else {
			System.out.println("The largest number is"+c);
		}
	}

}
