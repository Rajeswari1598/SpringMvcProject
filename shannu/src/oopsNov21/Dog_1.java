package oopsNov21;

public class Dog_1 extends Animal_1 {
    public static void main(String[] args) {
    	Animal_1 dog=new Dog_1();
		dog.street();
		System.out.println(dog.getHands());
		Animal_1 animal1=new Animal_1(4,1,"cat");
		animal1.street();
		System.out.println(animal1.getHands());
		Dog_1 dog1=new Dog_1();
		dog1.street();
		Dog_1 animal= (Dog_1) new Animal_1(4,1,"cat");
		animal.street();
		
	}
    public void street() {
    	System.out.println("it is stay in street");
    }
}
