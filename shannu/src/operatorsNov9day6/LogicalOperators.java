package operatorsNov9day6;

public class LogicalOperators {
	public boolean and(int value1,int value2) {
		boolean result=((value1<=value2)&&(value1>=value2));
		System.out.println(result);
		return result;
	}
	public boolean or(int value1,int value2) {
		boolean result=((value1>value2)||(value1<=10));
		System.out.println(result);
		return result;
	}
	public boolean not(int value1,int value2) {
		boolean result=!((value1>value2)||(value1<=10));
		System.out.println(result);
		return result;
	}
}
