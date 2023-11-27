package assignment;

public class Array1 {

	public static void main(String[] args) {
		//Two ways we declare a arrays the first one is used by the new keyword
		//second one is using open and close braces.
		int[] intArray=new int[3];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		Array1 array=new Array1();
		int[] result=array.declareArray();
		System.out.println(result[0]);
	}
     public int[] declareArray() {
    	 int[] intArray1= {10,20,30,40};
		return intArray1;
     }
}
