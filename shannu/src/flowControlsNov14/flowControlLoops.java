package flowControlsNov14;

import arraysNov8day5.IntArray;
import methodsNov7day4.Person;

public class flowControlLoops {
	public boolean flowLoop() {
    	  boolean flag=true;
    	  int i=0;
    	  while(flag) {
    		  System.out.println("loop"+i);
    		  int j=0;
    		  do{
    			if(i==6) {
    				System.out.println("6th iteration");
    				break;
    			}
    		  i++;
    		  }
    		  while(j++<10);
    			  flag=(i++<=10);
    	  }
    	  return false;
      }
	public boolean flowLoop1() {
		int index=0;
		for(;index<10;) {
			System.out.println(index);
			index++;
		}
		return false;
	}
	public void flowLoop2() {
		int intArray[]= {0,3,4,5,7};
		int index;
		for(index=0;index<intArray.length;index++) {
			System.out.println(intArray[index]);
		}
	}
	public void flowObject() {
		Person object=new Person();
		object.setPname("Raji");
		object.setAge(22);
		
		Person object1=object;
		Person[] values= {new Person("kavi",21),new Person(),new Person(),object,object1};
		for(int index=0;index<values.length;index++) {
			Person person=values[index];
			System.out.println("----index----"+index);
			System.out.println(person.getPname());
			System.out.println(person.getAge());
		}
	}
}
