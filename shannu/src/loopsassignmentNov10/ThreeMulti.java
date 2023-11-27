package loopsassignmentNov10;

public class ThreeMulti {
	public static void main(String[] args) {
		ThreeMulti multi=new ThreeMulti();
		multi.multiplication();
	}
    public void multiplication() {
    	for(int i=1;i<=10;i++) {
    		int result=3*i;
    		if(result%2!=0) {
    			System.out.print(result+",");
    		}
    	}
    }
}
