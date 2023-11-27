package oopsNov21;

public class Animal_1 {
    private int hands;
    private int tails;
    private String name;
    
	public Animal_1() {
		super();
	}
	public Animal_1(int hands, int tails, String name) {
		super();
		this.hands = hands;
		this.tails = tails;
		this.name = name;
	}
	public int getHands() {
		return hands;
	}
	public void setHands(int hands) {
		this.hands = hands;
	}
	public int getTails() {
		return tails;
	}
	public void setTails(int tails) {
		this.tails = tails;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void street() {
		System.out.println("Animal");
	}
    
    
}
