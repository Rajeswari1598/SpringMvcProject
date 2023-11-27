package exceptionNov17;

public class Multiple_5 {

	public static void main(String[] args) {
		Multiple_5 test=new Multiple_5();
		test.multiple();
	}

	private void multiple() {
		System.out.println("------------");
		   try {
	    	   int[] array=new int[5];
	    	   System.out.println("array value"+array[3]);
//			    int i=40/0;
//			    System.out.println("i value"+i);
//			    String name=null;
//			    System.out.println("name is"+name.charAt(0));
	    	   String name="Raji";
	    	   System.out.println("name is "+name.charAt(4));
		} catch (ArithmeticException e) {
			System.out.println("it is a arithemetic exception");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("it is a arrayindexoutof bounds exception");
		}catch (NullPointerException e) {
			System.out.println("null pointer exception class");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("string indexoutof bounds exception class");
		}
	       catch (Exception e) {
			System.out.println("parent for all the exception class");
		}finally {
			System.out.println("final");
		}
		System.out.println("------------");
	}

}
