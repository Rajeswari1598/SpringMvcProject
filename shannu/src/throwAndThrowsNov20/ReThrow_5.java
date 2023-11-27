package throwAndThrowsNov20;

public class ReThrow_5 {

	public static void main(String[] args) {
		ReThrow_5 test=new ReThrow_5();
		try {
			test.rethrow();
		} catch (ResultFound e) {
			e.printStackTrace();
		}
	}

	private void rethrow() throws ResultFound {
		try {
			int result=45/0;
		} catch (ArithmeticException e) {
			throw new ResultFound("it is give resultfound");
		}
	}

}
