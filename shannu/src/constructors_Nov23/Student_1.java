package constructors_Nov23;

public class Student_1 {
	String name;
	public Student_1() {
		this.name="unknown";
		System.out.println(name);
	}
	public Student_1(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student_1 student=new Student_1();
		//System.out.println(student);
		Student_1 student1=new Student_1("Raji");
		System.out.println(student1.name);
		student1.name="kadapa";
		System.out.println(student1.name);
	}
}
