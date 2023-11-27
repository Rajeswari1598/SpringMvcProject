package exceptionhandlingNov22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Child_2 extends Parent_2 {
	public void mom() {
		System.out.println("child mother");
	}

	public void dad() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("sbr/horijin");
		System.out.println("child father ");
	}

	public static void main(String[] args) {
	Parent_2 child=new Child_2();
	child.mom();
	System.out.println("hrllo");
	try {
		child.dad();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Parent_2 parent=new Parent_2();
	parent.mom();
	try {
		parent.dad();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
