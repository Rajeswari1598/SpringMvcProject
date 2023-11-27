package interfaceNov16;
public class interfaceClass_5 implements Interface_5{
	public static void main(String[] args) {
		interfaceClass_5 access=new interfaceClass_5();
		access.test(access);
		access.test1(access);
		access.test2(access);
		access.test3(access);
	}

	@Override
	public void test(Interface_5 access1) {
		//only public members only get the implimentation for interfaces.
		System.out.println("public method");
		System.out.println(access1.id);
	}

	@Override
	private void test1(Interface_5 access1) {
		//cant reduce the visibility of interface members
		System.out.println("private member");
		System.out.println(access1.id);
		
	}

	@Override
	void test2(Interface_5 access1) {
		//cant reduce the visibility of interface members
		System.out.println("default");
		System.out.println(access1.id);
		
	}

	@Override
	protected void test3(Interface_5 access1) {
		//cant reduce the visibility of interface members
		System.out.println("protected");
		System.out.println(access1.id);
		
	}

}
