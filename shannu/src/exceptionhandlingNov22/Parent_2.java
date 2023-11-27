package exceptionhandlingNov22;

import java.io.FileNotFoundException;

public class Parent_2 {
	String name;
	int age;
	public void mom() {
		System.out.println("Mother");
	}
	public void dad() throws FileNotFoundException{
		System.out.println("Father");
	}
	
}
