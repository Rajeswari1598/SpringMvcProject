package loopsassignmentNov10;

import java.util.Scanner;

public class Subjects7 {
	public void subjects() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject1");
		int sub1 = sc.nextInt();
		System.out.println("enter the subject2");
		int sub2 = sc.nextInt();
		System.out.println("enter the subject3");
		int sub3 = sc.nextInt();
		System.out.println("enter the subject4");
		int sub4 = sc.nextInt();
		System.out.println("enter the subject5");
		int sub5 = sc.nextInt();
		int[] array = { sub1, sub2, sub3, sub4, sub5 };
		int max = 0;
		int min = 0;
		int temp;
		int average = ((sub1 + sub2 + sub3 + sub4 + sub5) / array.length);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				if (array[i] <= array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
		}
		System.out.println("the min marks is"+array[0]);
		System.out.println("the max marks"+array[array.length-1]);
		System.out.println("the average marks"+average);
	}

	public static void main(String[] args) {
       Subjects7 subject=new Subjects7();
       subject.subjects();
	}

}
