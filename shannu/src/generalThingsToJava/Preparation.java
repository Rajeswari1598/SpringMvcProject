package generalThingsToJava;

public class Preparation {
	
		public void display(int i,double j) {
			System.out.println(i+j);
		}
		public double display(int p,int q) {
			return (p+q);
			
		}
		public static void main(String[] args) {
			Preparation p=new Preparation();
			p.display(4, 5.0);
			System.out.println(p.display(4, 5.0));
		}
		
		}



