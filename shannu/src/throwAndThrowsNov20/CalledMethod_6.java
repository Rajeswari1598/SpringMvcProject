package throwAndThrowsNov20;

public class CalledMethod_6 {

	public static void main(String[] args) {
		try {
		   String s=null;
		   System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("nullpointer");
		}
	}

}
