package operatorsNov9day6;

public class IncrementDecrement {
    public int preIncrement(int value1,int value2) {
    	int result=((++value1)+(++value2));
    	System.out.println(value1);
    	System.out.println(value2);
    	return result;
    }
    public int postIncrement(int value1,int value2) {
    	int result=((value1++)+(value2++));
    	System.out.println(value1);
    	System.out.println(value2);
    	return result;
    }
    public int preDecrement(int value1,int value2) {
    	int result=((--value1)+(--value2));
    	System.out.println(value1);
    	System.out.println(value2);
    	return result;
    }
    public int postDecrement(int value1,int value2) {
    	int result=((value1--)+(value2--));
    	System.out.println(value1);
    	System.out.println(value2);
    	return result;
    }
}
