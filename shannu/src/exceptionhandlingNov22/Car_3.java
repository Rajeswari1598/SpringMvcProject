package exceptionhandlingNov22;

import java.io.FileNotFoundException;

public class Car_3 extends Vehicle_3 {
	public void run() {
		System.out.println("car running");
	}
	public void steering() {
		int result=35/0;
		System.out.println(result);
	}
	public static void main(String[] args)  {
		Car_3 car=new Car_3();
		car.wheels();
		car.steering();
		Vehicle_3 vehicle=new Vehicle_3();
		try {
			vehicle.driving();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
