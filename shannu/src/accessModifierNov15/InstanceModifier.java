package accessModifierNov15;

import assignmentModifiersNov15.AllAccessModifiers;

public class InstanceModifier {

	public static void main(String[] args) {
		AllAccessModifiers modifier= new AllAccessModifiers();
		modifier.access2();
		System.out.println(modifier.age);
//		modifier.acess1();

	}

}
