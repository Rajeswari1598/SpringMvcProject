package throwAndThrowsNov20;

import java.io.FileNotFoundException;

public class FileInvalidException extends Exception{
	String messege;
//    public FileInvalidException() {
//    	super();
//    }
public FileInvalidException(String messege) {
    	super(messege);
    }
}
