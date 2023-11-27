package throwAndThrowsNov20;

public class UserDefined_2 {
   public void age(int age) throws AgeInsufficient {
	   if(age>=21) {
		   System.out.println("fine");
	   }
	   throw new AgeInsufficient("age is not matched");
   }
   public static void main(String[] args) {
	UserDefined_2 test=new UserDefined_2();
	try {
		test.age(22);
	} catch (AgeInsufficient e) {
		e.printStackTrace();
		System.out.println(e.message);
	}
}
}
