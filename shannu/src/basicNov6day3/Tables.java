package basicNov6day3;

import java.util.Scanner;

/**
 * This class is used to multiplication purpose from 1 to 20
 */
public class Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the table row upto we need");
		long row = sc.nextLong();
		System.out.println("enter the columns upto we need");
		long column = sc.nextLong();
			for (int index = 1; index <= row; index++) {

				for (int count = 1; count <= column; count++) {
					int result = index * count;
					System.out.println(index + "*" + count + "=" + result);
				}
				System.out.println("*******"); 
			}
		}
		

	}


