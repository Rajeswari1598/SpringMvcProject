package stringNov24;

public class StringBuffer_10 extends StringClass_10 {
    public void sleep() {
    	System.out.println("it is buffer class");
    }
    public static void main(String[] args) {
		//StringBuffer string=new StringClass_10();
		//here we get a error type mismatch cant covert string class to string buffer
    	StringBuffer buffer=new StringBuffer();
    	buffer.run();
    	buffer.sleep();
    	//String buffer is not access the super class members
	}
}
