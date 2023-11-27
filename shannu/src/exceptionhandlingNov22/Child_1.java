package exceptionhandlingNov22;

public class Child_1 extends Parent_1{
	
	public void mom() {
		System.out.println("Children mother");
	}
	public void dad() {
		int result=35/0;
		System.out.println(result);
		System.out.println("children father");
	}
	public static void main(String[] args) {
		Child_1 child=new Child_1();
		child.mom();
		child.dad();
	}

}
