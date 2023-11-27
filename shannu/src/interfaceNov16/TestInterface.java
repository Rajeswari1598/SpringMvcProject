package interfaceNov16;

public class TestInterface extends AbstractClass_2 implements Interface_2 {
	
     public void test() {
    	  Interface_2 obj1=new TestInterface();
    	  obj1.access();
    	  System.out.println(obj1.id);
     }
     public void abstractTest(TestInterface obj) {
    	 obj.calculate(value1,value2);
    	 System.out.println(obj.value1);
    	 System.out.println(obj.value2);
    	 obj.calculate1();
     }
	public static void main(String[] args) {
		TestInterface obj=new TestInterface();
       obj.test();
       obj.abstractTest(obj);
	}

	@Override
	public void access() {
		System.out.println("access to interface");
	}
	@Override
	public void calculate1() {
		System.out.println("calculate for abstract");
	}

}
