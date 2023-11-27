package assignmentModifiersNov15;

public class AllAccessModifiers {
	private String name;
	public int age;
	protected int id;
	String email;
       private void access1() {
    	   System.out.println("this is private member");
       }
       public void access2() {
    	   System.out.println("this is public member");
       }
       void acess3() {
    	   System.out.println("it is a default member");
       }
       protected void acess4() {
    	   System.out.println("it is a proteced member");
       }
}
