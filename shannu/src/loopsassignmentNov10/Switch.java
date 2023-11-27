package loopsassignmentNov10;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Switch sw=new Switch();
		sw.grade();
	}	
    public void grade() {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("please enter the marks");
    	int marks=sc.nextInt();
    	switch (marks/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println(" A+");
			break;
		case 8:
			System.out.println(" A");
			break;
		case 7:
			System.out.println("B+");
			break;
		case 6:
			System.out.println("B");
			break;
		case 5:
			System.out.println("c+");
			break;
		case 4:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
			break;
		case 2:
			System.out.println("Fail");
			break;
		default:
			System.out.println("it does not match");
			break;
		}
    }
}
