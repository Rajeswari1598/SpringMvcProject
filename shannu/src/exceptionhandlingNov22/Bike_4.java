package exceptionhandlingNov22;

public class Bike_4 extends Vehicle_4 {
	public void run() {
		System.out.println("bike running");
	}
	public void steering() {
		int result=35/0;
		System.out.println(result);
		System.out.println("steering");
	}
	public static void main(String[] args) {
		Bike_4 bike=new Bike_4();
		bike.run();
		bike.steering();
		Vehicle_4 vehicle=new Vehicle_4();
		vehicle.driving();
		vehicle.wheels();
		
	}
}
