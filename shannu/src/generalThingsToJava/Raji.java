package generalThingsToJava;

//public class ExamWeek_2 {
	//1
//	 for(int index =1; index <= 10;index++) {
//	            if (index/2 ==0 && index/5 ==0) {
//	            System.out.print(index);
	 //output=1
//	            }
//	        }
	 //2
//	  for(int index =1; index <= 10;)
//          System.out.print(index);
//          index++;
	 //Compiletime error
//	public static void printPattern(int patternValue) {
//        int outerIndex, innerIndex;
//        int num = 1;
//        for (outerIndex = 1; outerIndex <= patternValue; outerIndex++) {
//            for (innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
//                System.out.print(num + " ");
//            }
//           break;
//            System.out.println();
//        }
//    }
//
//    public static void main(String args[]) {
//        int patternValue = 5;
//        printPattern(patternValue);
//    }
//	public static void main(String[] args) {
////		int x = 2;
////		int y = 0;
////		for ( ; y < 10; ++y)
////		{
////		if (y % x == 0)
////		continue;
////		else if (y == 8)
////		break;
////		else
////		System.out.print(y + " ");
////		}
//		byte x = 64;
//		int i;
//		byte y;
//		System.out.println(x);
//		i = x << 2;
//		//64*2*2
//		System.out.println(i);
//		y = (byte) (x << 2);
//		System.out.print(i + " " + y);
//}
	
//}

//class static_out
//{
//static int x;
//static int y;
//void add(int a, int b)
//{
//x = a + b;
//y = x + b;
//}
//}
//public class Raji{
//public static void main(String args[])
//{
//static_out obj1 = new static_out();
//static_out obj2 = new static_out();
//int a = 2;
//obj1.add(a, a + 1);
//obj2.add(5, a);
//System.out.println(obj1.x + " " + obj2.y);
//}
//}
class access
{
public int x;
private int y;
void cal(int a, int b)
{
x = a + 1;
y = b;
}
}
public class access_specifier
{
public static void main(String args[])
{
access obj = new access();
obj.cal(2, 3);
System.out.println(obj.x + " " + obj.y);
}
}