package methodsNov7day4;

public class HelloWorld {
  static String name="Corenuts";
  long longValue=1200;
  double doubleValue=12.5;
  public double calculate(long value,double value1) {
	  double result=value*value1;
	  return result;
  }
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(HelloWorld.name);
		HelloWorld helloWorld=new HelloWorld();
		System.out.println(helloWorld.doubleValue);
		System.out.println(helloWorld.longValue);
		double result=helloWorld.calculate(1400,20.2);
		System.out.println(result);
		Person person=new Person();
//		System.out.println(person.pname);
		person.setPname("Corenuts Technology");	
		person.setAge(22);
		System.out.println(person.getPname());
		System.out.println(person.getAge());
		System.out.println(args[0]);//for the given values for main method in run configurarions
		System.out.println(args[2]);
	}

}
