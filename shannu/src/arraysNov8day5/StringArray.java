package arraysNov8day5;
public class StringArray {
	public void stringMethod() {
		String[] StringArray=new String[5];
		StringArray[0]="banglore";
		StringArray[1]="hyderabad";
		StringArray[2]="kadapa";
		StringArray[3]="yadadri";
		StringArray[4]="chennai";
		System.out.println(StringArray[2]);

	}
   public static void main(String[] args) {
         StringArray array=new StringArray();
         array.stringMethod();
         StringArray array1=new StringArray();
        String[] result=array1.arrayMethod();
        System.out.println(result[1]);
         
         //System.out.println(array.StringArray[4]);
}
  public String[] arrayMethod() {
	  String[] string= {"Ban","Hyd","Kdp","Ydd","Cni"};
	  return string;	   
   }
}
