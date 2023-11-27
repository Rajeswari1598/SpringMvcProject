package stringNov24;

public class ReverseofString_5 {

	public static void main(String[] args) {
		String str=new String("CoreNuts Technologies Pvt Ltd");
		for(int index=str.length()-1;index>=0;index--) {
			System.out.print(str.charAt(index));
		}
	}

}
