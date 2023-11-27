package loopsassignmentNov10;

import java.util.Scanner;

public class ElectricityBill8 {
	public void electricity() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the units");
		int units=sc.nextInt();
		if(units<=0&&units<=50) {
			System.out.println("Rs 200-Minimum Usage");
		}else if(units>=51&&units<=100) {
			System.out.println("Rs 5 per unit-Moderate Usage");
		}else {
			System.out.println("Rs 8 per unit-High Usage ");
		}
	}

	public static void main(String[] args) {
		ElectricityBill8 electric=new ElectricityBill8();
		electric.electricity();

	}

}
