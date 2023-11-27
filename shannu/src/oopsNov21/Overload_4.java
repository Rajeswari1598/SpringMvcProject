package oopsNov21;

public class Overload_4 implements Vehicle_3{
	public void car(Car_3 car) {
		car.wheels();
	}
	public void car(Maruthi_3 maruthi) {
		maruthi.wheels();
	}
	
	public static void main(String[] args) {
		Overload_4 overload=new Overload_4();
		overload.car(new Car_3());
		overload.car(new Maruthi_3());
	}

	@Override
	public Object wheels() {
		return new Car_3();		
	}

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		
	}
}

