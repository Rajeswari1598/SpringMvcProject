package wrapperNov27;

public class WrapObjects_2 {

	public static void main(String[] args) {
		WrapObjects_2 object=new WrapObjects_2();
		object.wrap();
	}

	private void wrap() {
		int intvalue=100;
		byte bytevalue=5;
		short shortvalue=1;
		char charvalue='A';
		double doublevalue=10.22;
		
		Integer integer=new Integer(intvalue);
		System.out.println("integer value : "+integer);
		Character ch=new Character(charvalue);
		System.out.println("character value : "+ch);
		Byte by=new Byte(bytevalue);
		System.out.println("byte value : "+by);
		Short sht=new Short(shortvalue);
		System.out.println("short value : "+sht);
	}

}
