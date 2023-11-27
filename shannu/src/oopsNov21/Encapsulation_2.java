package oopsNov21;

public class Encapsulation_2 {
	private String name;
	private int age;
	
	public Encapsulation_2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	public Encapsulation_2( int age,String name) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void animal() {
		System.out.println("animal class");
	}
	public static void main(String[] args) {
		Encapsulation_2 test=new Encapsulation_2("kavi",21);
		test.animal();
		//test.setAge(22);
		//test.setName("Raji");
		System.out.println(test.getAge());
		System.out.println(test.getName());
//		Encapsulation_2 test1=new Encapsulation_2(21,"raji");
	}
}
