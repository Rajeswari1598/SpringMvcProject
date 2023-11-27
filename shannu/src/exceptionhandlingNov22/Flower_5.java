package exceptionhandlingNov22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Flower_5 {
	public void smell() {
		System.out.println("Flower smell");
	}
	public void color() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("Flower");
		System.out.println("flower colour");
	}
}
