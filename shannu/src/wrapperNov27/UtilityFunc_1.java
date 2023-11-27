package wrapperNov27;

public class UtilityFunc_1 {
	public static void main(String[] args) {
		UtilityFunc_1 function = new UtilityFunc_1();
		function.utility();
	}

	public  void utility() {
		int value=100;
		Integer value1=Integer.valueOf(value);
		System.out.println(value1);
		Integer value2=new Integer(value);
		System.out.println(value2);
		char charvalue='A';
		Character ch=Character.valueOf(charvalue);
		System.out.println(ch);
		double doublevalue=22.99;
		Double db=Double.valueOf(doublevalue);
		System.out.println(db);
		boolean bool=true;
		Boolean b=Boolean.valueOf(bool);
		System.out.println(b);
		float fl=6.2f;
		Float flot=Float.valueOf(fl);
		System.out.println(flot);
		
		Integer index=Integer.parseInt("100000");
		System.out.println(index);
		Byte index1=Byte.parseByte("22");
		System.out.println(index1);
		
		int intvalue=Integer.valueOf(value2);
		System.out.println(intvalue);
		
		
		//character does have parse method
	}
}
