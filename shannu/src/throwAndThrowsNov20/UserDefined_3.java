package throwAndThrowsNov20;

public class UserDefined_3 {

	public static void main(String[] args) {
		UserDefined_3 test = new UserDefined_3();
		try {
			test.age(15);
		} catch (NotEligible e) {
			e.printStackTrace();
		}

	}

	public void age(int age) throws NotEligible {
		try {
			System.out.println(age/0);
		} catch (Exception e) {
			if (age < 18) {
				throw new NotEligible("if the age is less");
			}
		}

	}

}
