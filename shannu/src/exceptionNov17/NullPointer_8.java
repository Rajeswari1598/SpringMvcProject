package exceptionNov17;

public class NullPointer_8 {

	public static void main(String[] args) {
		NullPointer_8 test=new NullPointer_8();
		test.nullException();
	}

	private void nullException() {
		try {
			String name="Sandy";
			System.out.println("name is"+name);
			System.out.println("name1 is :"+name.charAt(3));
		}
//		catch (Exception e) {
//			System.out.println("it is a parent class");
//		}
		catch (NullPointerException e) {
			System.out.println("it is a nullpointer exception");
		}
		
	}

}
