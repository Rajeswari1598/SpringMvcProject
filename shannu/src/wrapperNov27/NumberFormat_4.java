package wrapperNov27;

public class NumberFormat_4 {

	public static void main(String[] args) {
		NumberFormat_4 number=new NumberFormat_4();
		number.number();
	}

	public  void number() {
		String str="12d";
		Integer integer=Integer.parseInt(str);
		System.out.println(integer);
	}

}
