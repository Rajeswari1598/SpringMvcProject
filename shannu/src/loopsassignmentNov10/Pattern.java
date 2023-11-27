package loopsassignmentNov10;

public class Pattern {
	public void numberPattern() {
		
		for(int i=1;i<=5;i++) {
			int num=1;
			for(int j=1;j<=5;j++) {
				if(i>=j) {
				System.out.print(num++);
				}
				
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
        Pattern pattern=new Pattern();
        pattern.numberPattern();
	}

}
