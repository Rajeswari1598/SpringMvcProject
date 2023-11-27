package exceptionNov17;

public class Arithemetic_2 {
	public void arithemetic() {
		System.out.println("---------");
		try {
			int result=34/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
	}

	public static void main(String[] args) {
		Arithemetic_2 test=new Arithemetic_2();
		test.arithemetic();
	}

}
