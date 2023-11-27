package oopsNov21;

public class IsA_5 {

	public static void main(String[] args) {
		Bank_5 bank=new Atm_5();
		bank.sbi();
		bank.aaxis();
		bank.simpleintrest(2, 10, 20);
		Atm_5 atm=new Atm_5();
		atm.aaxis();
		atm.sbi();
		atm.simpleintrest(2, 10, 10);
	}

}
