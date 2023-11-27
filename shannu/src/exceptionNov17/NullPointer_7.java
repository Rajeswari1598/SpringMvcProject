package exceptionNov17;

public class NullPointer_7 {

	public static void main(String[] args) {
		NullPointer_7 test=new NullPointer_7();
		test.exceptionTest();
	}

	private void exceptionTest() {
		try {
			String name=null;
			System.out.println("name is"+name.charAt(0));
			
		}finally {
			System.out.println("closed");
		}
//		catch (NullPointerException e) {
//			System.out.println("null pointer exception");
		//give this it will handled
//		}
		
	}

}
