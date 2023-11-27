package interfaceNov16;

public class TestCalculation_1 {

	public static void main(String[] args) {
		System.out.println("**************");
		Calculation calculate=new Calculate();
		Calculation object=new Calculate1();
		calculate.calculation();
		object.calculation();
		System.out.println(Calculation.value1);
		System.out.println(Calculation.value2);
		System.out.println("**************");

	}

}
