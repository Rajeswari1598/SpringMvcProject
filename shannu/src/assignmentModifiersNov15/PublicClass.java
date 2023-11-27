package assignmentModifiersNov15;

import methodsNov7day4.Person;

public class PublicClass {
   public void publicAcess() {
	  Person person=new Person();
	  System.out.println(person.getPname());
	  System.out.println(person.getAge());
   }
   public static void main(String[] args) {
	PublicClass publicclass = new PublicClass();
	publicclass.publicAcess();
}
}
