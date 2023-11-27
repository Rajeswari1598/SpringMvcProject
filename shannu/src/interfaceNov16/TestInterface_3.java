package interfaceNov16;

public class TestInterface_3 implements Interface_3{
	public void access(TestInterface_3 test) {
		test.calculate();
		//test.value1=22;
		//value can not be assigned
		//test.value2=40;
		System.out.println(test.value1);
		System.out.println(test.value2);
	}

	public static void main(String[] args) {
		TestInterface_3 test=new TestInterface_3();
		test.access(test);
		test.calculate();
		
	}

	@Override
	public void calculate() {
		System.out.println("hiiii");
		
	}

}
