package stringNov24;

public class Character_1 {
	public static void main(String[] args) {
	String str=new String("Corenuts");
	String str1="Core";
	//converts String into character array by using tocharArray()
	char[] str2=str.toCharArray();
	for(int index=0;index<=str.length()-1;index++) {
		System.out.println(str2[index]);
	}
	}
	
}
