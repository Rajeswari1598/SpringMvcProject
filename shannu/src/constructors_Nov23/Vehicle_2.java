package constructors_Nov23;

public class Vehicle_2 {
	String name;
	int wheels;
	String colour;
	public Vehicle_2() {
		System.out.println("default");
	}
	public Vehicle_2(String name,int wheels) {
		this.name=name;
		this.wheels=wheels;
	}
	public Vehicle_2(String colour) {
		this();
		this.colour = colour;
	}
	

	
}
