package wrapperNov27;

public class MethodsOfwraper_6 {

	public static void main(String[] args) {
		MethodsOfwraper_6 obj=new MethodsOfwraper_6();
		obj.members();
	}

	public void members() {
		int integer=10;
		String int1=Integer.toString(integer);
		System.out.println(int1);
		String str="32";
		Integer int2=Integer.valueOf(str);
		System.out.println(int2);
		Integer int3=Integer.parseInt(str);
		System.out.println(int3);
	}

}
