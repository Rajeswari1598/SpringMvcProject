package stringNov24;

public class ReverseWors_6 {

	public static void main(String[] args) {
	  String str=new String("CoreNuts Technologies Pvt Ltd");
	  String[] str1=str.split(" ");
	 for(int index=str1.length-1;index>=0;index--) {
		 System.out.print(str1[index]+" ");
	 }
	}

}
