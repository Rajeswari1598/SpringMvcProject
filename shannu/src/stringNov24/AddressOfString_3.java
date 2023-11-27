package stringNov24;

public class AddressOfString_3 {

	public static void main(String[] args) {
		String str=new String("Corenuts Technology pvt ltd");
		String str1="Corenuts Technology pvt ltd";
		//Compare the address in string by using double equals
		System.out.println(str==str1);
		//Compare the values in string by using equals()
		System.out.println(str.equals(str1));
	}

}
