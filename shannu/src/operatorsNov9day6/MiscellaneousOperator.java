package operatorsNov9day6;

public class MiscellaneousOperator {
    public String condition(int value1,int value2) {
    	String result=(value1>value2)?"greater":"less";
    	System.out.println(result);
    	return result;
    }
    public boolean instanceOfString(Object object) {
    	boolean result=(object instanceof String);
    	System.out.println(result);
    	return result;
    }
}
