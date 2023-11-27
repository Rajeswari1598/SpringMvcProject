package exceptionNov17;

public class TryCatchFinally_3 {
	public void tryfinally() {
		System.out.println("---------");
		try {
			int result=45/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("it is a final block");
		}
		System.out.println("---------");
	}

	public static void main(String[] args) {
		TryCatchFinally_3 test=new TryCatchFinally_3();
		test.tryfinally();
	}

}
