package wrapperNov27;

public class StringtoPrimitive_3 {
	public static void main(String[] args) {
		StringtoPrimitive_3 primitive=new StringtoPrimitive_3();
		primitive.convert();
	}

	public void convert() {
		System.out.println("***********");
		String str="10";
		Integer index=Integer.parseInt(str);
		System.out.println(index);
		String str1="12.0";
//		Character ch=Character.valueOf((char) 0);
		Double db=Double.parseDouble(str1);
		System.out.println(db);
		Short sht=Short.parseShort(str1);
		System.out.println(sht);
		System.out.println("***********");
		
	}
}
