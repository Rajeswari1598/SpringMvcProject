package oopsNov21;

public class TestAbstract_2 extends Abstraction_2{

	public static void main(String[] args) {
         TestAbstract_2 test=new TestAbstract_2();
         test.calculation(10, 20);
         test.run();
	}

	@Override
	public void run() {
		System.out.println("this is abstract method");
		
	}

}
