package loopsassignmentNov10;

public class SortingBubbleInsersionSelection {
	public void bubbleSort() {
		int[] values = { 8, 2, 3, 7, 9, 10 };
		int temp;
		for (int index1 = 0; index1 < values.length; index1++) {
			for (int index2 = 0; index2 <= values.length - 1; index2++) {
				if (values[index1] <= values[index2]) {
					temp = values[index1];
					values[index1] = values[index2];
					values[index2] = temp;
				}
			}
		}
		for (int index1 = 0; index1 < values.length; index1++) {
			System.out.print(values[index1]);
		}
	}

	public void insersionSort() {
    	 int[] values= {8,2,3,7,9,10};
  	    int temp;
  	    for(int index1=0;index1<values.length;index1++) {
  	    	for(int index2=0;index2<=values.length-1;index2++) {
  	    		if(values[index1] <= values[index2]) {
  	    			temp = values[index1];
					values[index1] = values[index2];
					values[index2] = temp;
  	    		}
  	    	}
  	    	
  	    }
     }
	public void selectionSort() {
		
	}

	public static void main(String[] args) {
		SortingBubbleInsersionSelection sorting = new SortingBubbleInsersionSelection();
		sorting.bubbleSort();
		sorting.insersionSort();
		sorting.selectionSort();	
	}

}
