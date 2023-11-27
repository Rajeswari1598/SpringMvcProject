package loopsassignmentNov10;

public class PrintOneToHundres {
 public static void main(String[] args) {
	PrintOneToHundres print=new PrintOneToHundres();
	print.oneToHun();
}
 public void oneToHun() {
	 for(int i=1;i<=100;i++) {
		 if(i==47) {
			 break;
		 }
		 System.out.println(i);
	 }
 }
}
