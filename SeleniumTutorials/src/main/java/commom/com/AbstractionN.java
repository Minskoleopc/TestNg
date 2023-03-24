package commom.com;

public class AbstractionN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E e = new E(); 
		
		F f = new F();
		f.displayA();
		f.displayC();
	}

}

abstract class E {
	int a = 10;
	int b = 30;
	
	abstract void displayB();

	public void displayC() {
		System.out.println("I am from C class");
	}
	
	
}


class F extends E{
	
	public void displayA() {
		System.out.println(a);
	}
	
	public void displayB() {
		System.out.println("Display B");
	}

}

