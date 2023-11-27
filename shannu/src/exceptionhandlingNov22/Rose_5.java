package exceptionhandlingNov22;

public class Rose_5 {
	public void rose() {
		System.out.println("Red rose");
	}
	public void lilli() {
		System.out.println("white lilli");
	}
	public static void main(String[] args) {
		Rose_5 rose1=new Rose_5();
		rose1.rose();
		Flower_5 flower=new Flower_5();
		flower.color();
		flower.smell();
	}

}
