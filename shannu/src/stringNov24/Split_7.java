package stringNov24;

public class Split_7 {

	public static void main(String[] args) {
		String str=new String("CoreNuts,Technologies,Pvt,Ltd");
		String[] str1=str.split(",");
		System.out.println(str);
		for(int index=0;index<str1.length;index++) {
			System.out.print(str1[index]+" ");
		}
	}

}
