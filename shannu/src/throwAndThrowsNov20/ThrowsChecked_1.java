package throwAndThrowsNov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsChecked_1 {

	public static void main(String[] args)  {
		System.out.println("main method");
		ThrowsChecked_1 test = new ThrowsChecked_1();
		System.out.println("calling function");
		//test.function();
		System.out.println("called function");
		try {
			test.throwfunc();
		} catch (FileInvalidException e) {
			e.printStackTrace();
		}
		//throw new FileNotFoundException();
//		try {
//			FileInputStream fileInputStream=new FileInputStream("sbr/exception");
//		} catch (FileNotFoundException e) {
//			System.out.println("it is filenot found exception");
//			e.printStackTrace();
//		}
	}
//
//	public void function() {
//		try {
//			FileInputStream fileInputStream = new FileInputStream("sbr/exception");
//		} catch (FileNotFoundException e) {
//			System.out.println("calling ");
//			e.printStackTrace();
//		}
//	}

	public void throwfunc() throws FileInvalidException {
		throw new FileInvalidException("file name is not found");
	}
}
