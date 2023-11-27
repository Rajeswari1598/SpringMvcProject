package wrapperNov27;

public class StringCheck_5 {

	public static void main(String[] args) {
		StringCheck_5 check=new StringCheck_5();
		check.stringCheck();
	}

	public void stringCheck() {
		try {
			String str="123";
			Integer integer=Integer.parseInt(str);
			if(integer>=0) {
				System.out.println("it is a number");
			}else {
				System.out.println("it is a string");
			}
		} catch (NumberFormatException e) {
			System.out.println("it is a string");
		}
	}

}
