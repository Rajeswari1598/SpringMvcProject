package arraysNov8day5;

import methodsNov7day4.Person;

public class PersonArray {
	public static void main(String[] args) {
		PersonArray array = new PersonArray();
		Person[] result = array.person();
		// call the another method by using reference variable
		// it is stored in another variable called result with the person array type
		System.out.println(result[0].getPname());
		System.out.println(result[2]);//it will give the address of an person1 object
		// here return the null value because without set the vale it shows defaultvalues
	    System.out.println(result[0].getAge());
	    System.out.println(result[2].getPname());
	}

	public Person[] person() {
    	Person[] persons=new Person[5];
        Person person=new Person();
        person.setPname("Raj");
        person.setAge(21);
        // persons[0]=person;
    	Person person1=new Person();
    	//persons[1]=person1;
    	Person person2=new Person();
    	//persons[2]=person2;
    	Person person3=new Person();
    	//persons[3]=person3;
    	Person person4=new Person();
    	//persons[4]=person4;
    	
    	return new Person[] {person,person1,person2,person3,person4};
	}
}
