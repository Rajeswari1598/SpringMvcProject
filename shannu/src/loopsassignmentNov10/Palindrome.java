package loopsassignmentNov10;

public class Palindrome {

	public static void main(String[] args) {
		int num=3443,palin=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			palin=palin*10+rem;
			num=num/10;
		}
		if(palin==temp) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a polindrome");
		}
	}

}
