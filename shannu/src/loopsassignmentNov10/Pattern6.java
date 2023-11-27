package loopsassignmentNov10;

public class Pattern6 {

	public static void main(String[] args) {
		Pattern6 pattern = new Pattern6();
		pattern.timeTable1();
		pattern.timeTable();
	}

	public void timeTable1() {
		System.out.print("*|");
		for (int k= 1; k<= 9; k++) {
			int rem1 = 1*k;
			System.out.print(rem1);
		}
		System.out.println();
		System.out.println("-------------");
	}

	public void timeTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "|");
			for (int j = 1; j <= 9; j++) {
				int rem = i * j;
				System.out.print(rem);
			}
			System.out.println();
		}
	}

}
