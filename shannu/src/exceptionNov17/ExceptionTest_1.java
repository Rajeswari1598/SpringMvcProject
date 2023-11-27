package exceptionNov17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest_1 {
	public void exception() {
		System.out.println("---------");
		try {
			FileInputStream fileInputStream=new FileInputStream("xml.street");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
	}

	public static void main(String[] args) {
		ExceptionTest_1 test=new ExceptionTest_1();
		test.exception();
	}

}
