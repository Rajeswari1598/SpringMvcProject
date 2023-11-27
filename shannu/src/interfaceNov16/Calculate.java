package interfaceNov16;

public class Calculate extends AbstractClass_2 implements Calculation{
	
	@Override
	public void calculation() {
		System.out.println("**************");
		System.out.println("calculation");
		System.out.println("**************");
	}

	@Override
	public void calculate1() {
		System.out.println("abstract class");
	}
}
