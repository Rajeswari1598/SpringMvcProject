package loopsassignmentNov10;

public class Pattern4 {
	public void starPattern() {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i+j<=10) {
			         if(i==2||i==4)
			         {
			        	 break;
			         }
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern4 pattern=new Pattern4();
		pattern.starPattern();
	}

}
