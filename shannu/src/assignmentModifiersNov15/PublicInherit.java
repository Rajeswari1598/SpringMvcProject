package assignmentModifiersNov15;

import methodsNov7day4.Person;

public class PublicInherit extends Person {
    public void publicAcess() {
    	Person person=new Person();
//    	System.out.println(person.pname); only the person having public members 
//    	then only create like this
    	System.out.println(person.getAge());
//    	this is used in the members are private
    }
}
