package oopsNov21;

public class Atm_5 implements Bank_5 {
	@Override
	public void aaxis() {
		System.out.println("Aaxis");
	}

	@Override
	public void sbi() {
		System.out.println("sbi");
	}

	@Override
	public void simpleintrest(int p, int t, int r) {
		System.out.println((p*t*r)/100);
		
	}

}
