package constructors_Nov23;

public class Car_2 extends Vehicle_2{
	
	
	public Car_2() {
		super();
		System.out.println("default");
	}

	public Car_2(String name, int wheels) {
		super(name, wheels);
	}

	public Car_2(String colour) {
		super(colour);
	}

	public static void main(String[] args) {
		Car_2 car=new Car_2("red");
		System.out.println(car.colour);
		System.out.println(car.name);
		Car_2 car1=new Car_2("suzuki",2);
		System.out.println(car1.name);
		System.out.println(car1.wheels);
		Vehicle_2 vehicle=new Vehicle_2("Audi",2);
		System.out.println(vehicle.colour);
		System.out.println(vehicle.name);
		System.out.println(vehicle.wheels);
		vehicle.colour="black";
		System.out.println(vehicle.colour);
	}

}
