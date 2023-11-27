package throwAndThrowsNov20;

public class NotEligible extends Exception {
String m;

public NotEligible(String m) {
	super(m);
	this.m = m;
}

}
