package loopsassignmentNov10;

public class ForInsideSwitch {

	public static void main(String[] args) {
		for(int index=0;index<5;index++) {
			int value=1;
			switch (value) {
			case 1:
				System.out.println("it print the Sunday");
//				break;
			case 2:
				System.out.println("it print the Monday");
//				break;
			case 3:
				System.out.println("it print the Tuesday");
//				break;
			case 4:
				System.out.println("it print the wednesday");
				break;
			default:
				break;
			}
		}

	}

}
