package operatorsNov9day6;

public class RelationalOperator {
	public boolean lessThan(int value1,int value2) {
		boolean result=(value1<value2);
		System.out.println(result);
		return result;
	}
	public boolean greaterThan(int value1,int value2) {
		boolean result=(value1>value2);
		System.out.println(result);
		return result;
	}
	public boolean lessThanEqual(int value1,int value2) {
		boolean result=(value1<=value2);
		System.out.println(result);
		return result;
	}
	public boolean greaterThanEqual(int value1,int value2) {
		boolean result=(value1>=value2);
		System.out.println(result);
		return result;
	}
	
}
