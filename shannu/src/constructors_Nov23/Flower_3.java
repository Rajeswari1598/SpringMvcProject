package constructors_Nov23;

public class Flower_3 {
	String name;
	int petals;
	String color;

	public Flower_3() {
		System.out.println("default");
	}
	
	public Flower_3(String name, int petals) {
		this();
		this.petals = petals;
	}

	public Flower_3(String color) {
		this();
		this.color = color;
	}

	public static void main(String[] args) {
		Flower_3 flower =new Flower_3("black");
		System.out.println(flower.name);
		System.out.println(flower.petals);
		System.out.println(flower.color);
		
	}

}
