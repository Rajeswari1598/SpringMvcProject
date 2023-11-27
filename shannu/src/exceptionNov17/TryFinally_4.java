package exceptionNov17;

public class TryFinally_4 {
	public void tryFinally() {
		System.out.println("---------");
		try {
			int result=43/0;
		}finally {
			System.out.println("it is a finally block");
		}
		System.out.println("---------");
	}

	public static void main(String[] args) {
		TryFinally_4 test=new TryFinally_4();
		test.tryFinally();
	}

}
