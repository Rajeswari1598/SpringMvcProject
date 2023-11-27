package loopsassignmentNov10;

public class Sorting {

	public static void main(String[] args) {
		int[] values= {8,2,3,7,9,10};
	    int temp;
	    for(int index1=0;index1<values.length;index1++) {
	    	for(int index2=0;index2<=values.length-1;index2++) {
	    		if(values[index1]<=values[index2]) {
	    			temp=values[index1];
	    			values[index1]=values[index2];
	    			values[index2]=temp;
	    		}
	    	}
	    }
	    System.out.print("ascending order"+":");
	    for(int index1=0;index1<values.length;index1++) {
	    	System.out.print(values[index1]);
	    }
	    System.out.println();
	    System.out.print("descending order"+":");
	    for(int index1=values.length-1;index1>=0;index1--) {
	    	System.out.print(values[index1]);
	    }
	}

}
