package throwAndThrowsNov20;

public class ResultFound extends Exception {
	String s;

	public ResultFound(String s) {
		super(s);
		this.s = s;
	}
	
}
