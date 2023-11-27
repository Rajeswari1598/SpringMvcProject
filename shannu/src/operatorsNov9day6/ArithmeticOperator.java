package operatorsNov9day6;

public class ArithmeticOperator {
      public int addition(int value1,int value2) {
    	 int result=((value1+value2)+(value1+10));
    	 System.out.println("additionresult-"+result);
    	 return result;	
      }
      public int substraction(int value1,int value2) {
    	  int result=((value1-value2)+20);
    	  System.out.println("substracted value-"+result);
    	  return result;
      }
      public int multiplication(int value1,int value2) {
    	  int result=((value1*value2)+20);
    	  System.out.println("multiplication value-"+result);
    	  return result;
      }
      public int division(int value1,int value2) {
    	  int result=((value1/value2)+20);
    	  System.out.println("division value-"+result);
    	  return result;
      }
      public int modulus(int value1,int value2) {
    	  int result=(value1%value2);
    	  System.out.println("modulus value-"+result);
    	  return result;
      }
}
