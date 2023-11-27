package accessModifierNov15;

public class Raji extends PublicTest {
	
	public static void main(String[] args) {
		Raji raj=new Raji();
		raj.caluculation(0, 0);
		raj.caluculation2();
	}

	@Override
	public void caluculation2() {
}

	public Raji() {
		super();
		System.out.println("hiii");
	}
	
}
