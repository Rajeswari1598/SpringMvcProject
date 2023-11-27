package oopsNov21;

public class Dog_6 extends Animal_6{
	public void eating() {
		System.out.println("dog also eat");
	}

	public Dog_6(String name, int legs) {
		super(name, legs);
	}
	public static void main(String[] args) {
		Dog_6 dog=new Dog_6("Huski", 4);
		dog.eating();
		Animal_6 animal=new Animal_6("snoopi", 4);
		animal.eating();
	}

}
