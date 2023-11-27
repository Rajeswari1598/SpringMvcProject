package throwAndThrowsNov20;

public class AgeInsufficient extends Exception {
    String message;

	public AgeInsufficient(String message) {
		super(message);
		this.message = message;
	}
    
}
