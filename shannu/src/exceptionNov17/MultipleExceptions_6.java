package exceptionNov17;

public class MultipleExceptions_6 {
	public void multipleException() {
       System.out.println("--------------");
       try {
   		int[] array=new int[4];
   		System.out.println("array value"+array[3]);
   		int a=30/0;
   		System.out.println("integer value"+a);
   		}
   		catch (Exception e) {
   			System.out.println("it is a parent class");
   		}
       System.out.println("--------------");
	}

	public static void main(String[] args) {
		MultipleExceptions_6 test=new MultipleExceptions_6();
		test.multipleException();
	}

}
