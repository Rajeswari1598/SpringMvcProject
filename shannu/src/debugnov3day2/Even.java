package debugnov3day2;

public class Even extends SumOfTwoNum{
	public static void main(String[] args) {
		walk();
		run();
		int num = 2;
		if (num % 2 == 0) {
			System.out.println("it is a even number");
		} else {
			System.out.println("it is odd number");
	}
	}

	public static void run() {
		
		int num = 5;
		if (num % 2 == 0) {
			System.out.println("it is a even number");
		} else {
			System.out.println("it is odd number");
		}
	}
}
