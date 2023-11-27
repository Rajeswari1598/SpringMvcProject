package operatorsNov9day6;

public class DifferentiateAnd {
       public boolean singleAnd(int value1,int value2) {
    	   boolean result=((value1<value2)&(++value1>value2));
    	   System.out.println(value1);
    	   System.out.println(value2);
    	   System.out.println(result);
    	   return result;
       }
       public boolean doubleAnd(int value1,int value2) {
    	   boolean result=((value1<value2)&&(++value1>value2));
    	   System.out.println(value1);
    	   System.out.println(value2);
    	   System.out.println(result);
    	   return result;
       }
}
