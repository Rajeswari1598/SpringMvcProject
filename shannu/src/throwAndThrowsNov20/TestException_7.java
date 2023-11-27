package throwAndThrowsNov20;

public class TestException_7 extends Exception_7 {

	public static void main(String[] args) {
		TestException_7 test=new TestException_7();
		try {
			test.calculate(10, 20);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			test.calculate1(2, 10);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void calculate(int i, int j) {
		System.out.println((i+j)/0);
		
	}

	@Override
	public void calculate1(int k, int l) {
		System.out.println((k+l)/0);
		
	}

}
