package oopsNov21;

public class Animal_6 {
   private String name;
   private int legs;
   
public Animal_6(String name, int legs) {
	super();
	this.name = name;
	this.legs = legs;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
public void eating() {
	System.out.println("animals are eating");
}
   
}
