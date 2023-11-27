package assignmentModifiersNov15;

public class PersonAbstract extends AbstractAccess {
   public String name;
   public int age;
   
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

@Override
void access() {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	PersonAbstract personabstract = new PersonAbstract();
	personabstract.calculation(0, 0);
	personabstract.access();
	System.out.println(personabstract.age);
	System.out.println(personabstract.name);
}
   
}
