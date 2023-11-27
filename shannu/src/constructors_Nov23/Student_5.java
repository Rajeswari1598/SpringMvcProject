package constructors_Nov23;

public class Student_5 {
		static int id;
		static String name;
		public Student_5(int id,String name) {
			this.id=id;
			this.name=name;
		}
		

	public static void main(String[] args) {
		Student_5 student=new Student_5(1,"supriya");
		System.out.println(student.id);
		System.out.println(student.name);
		
	}

}
