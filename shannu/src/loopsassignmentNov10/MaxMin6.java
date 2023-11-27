package loopsassignmentNov10;

public class MaxMin6 {
	public void maxMinArray() {
		int[] array = { 4, 5, 2, 0, 7, 3 };
		int max = 0;
		int min = 0;
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				if (array[i] <= array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
		}
		System.out.println("the maximum value in array is"+array[0]);
		System.out.println("the maximum value in array is"+array[array.length-1]);
	}

	public static void main(String[] args) {
		MaxMin6 array = new MaxMin6();
		array.maxMinArray();

	}

}
