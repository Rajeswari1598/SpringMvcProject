package loopsassignmentNov10;

public class Pattern1 {
	public void hash(){
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("#");
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
       Pattern1 pattern=new Pattern1();
       pattern.hash();
	}

}
