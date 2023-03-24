package commom.com;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// private 
		
		B b = new B();
		//b.dataA;
		//System.out.println(dataA);
		b.displayB();

	}

	
}

class B {
	
	private int dataA = 40;
	
	public void displayB() {
		System.out.println(dataA);
	}
	
}
