package assignmentModifiersNov15;

public abstract class NonAccessModifiers {
       final String name = "RAJi";
       abstract int age;
       //it will show a error called abstract cant be used in variables
       public final void acess() {
    	   System.out.println("it is final");
    	   System.out.println(name);
       }
       public abstract void acess1();
       public static void main(String[] args) {
		NonAccessModifiers modifier=new NonAccessModifiers() {

			@Override
			public void acess1() {
				// TODO Auto-generated method stub
				
			}
			modifier.acess();
		
	}
		
		
}
	public NonAccessModifiers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
