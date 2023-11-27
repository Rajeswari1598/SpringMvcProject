package accessModifierNov15;

import assignmentModifiersNov15.AllAccessModifiers;

public class AllModifierTest extends AllAccessModifiers {

	public static void main(String[] args) {
          AllModifierTest test=new AllModifierTest();
          test.access2();
          //test.access1();//Private members are accept only in that class
         //test.acess3();//default is package scope
          test.acess4();//protected is accessed in another package only with in the inheritance only
          //test.email;//default is package
          System.out.println(test.age);
          System.out.println(test.id);
          //System.out.println(test.name);
          //private members are not access in another package
	}
	

}
