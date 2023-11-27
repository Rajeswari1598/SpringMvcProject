package throwAndThrowsNov20;

public class NestedTry_4 {

	public static void main(String[] args) {
		NestedTry_4 test=new NestedTry_4();
		test.nested();
	}

	private void nested() {
	 try {
		int result=34/2;
		System.out.println(result);
		try {
			int result1=35/0;
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
			System.out.println("result1"+e1.getMessage());
		}
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("result"+e.getMessage());
	}
		
	}

}
