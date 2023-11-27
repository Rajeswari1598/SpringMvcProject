package exceptionhandlingNov22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Vehicle_3 {
	public void wheels() {
		System.out.println("vehicle wheels");
	}
	public void driving() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("sbr/horizon");
		System.out.println("vehicle driving");
	}
}
