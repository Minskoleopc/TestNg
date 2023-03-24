
public class dayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// addition   -- + 
		// subtraction -- -
		// multiplication  -- * 
		// division  -- /
		// modulus -- %
				
		int x = 100;
		int y = 50;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Calling the function 
		
		Calculator(12,3);
		Calculator(10,5);
		
		additionA();
		additionA();
		additionA();
		additionA();
		
		
		additionB(12,3);
		additionB(1,3);
		additionB(2,3);
		additionB(6,7);
		
		
		int q = additionC(12,3);
		System.out.println(q);
		System.out.println(q - 3);
		System.out.println(q - 2);
	}
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	// function without parameter and without return type
	public static void additionA() {
		System.out.println(9+3);
	}

	// function with parameter and without return type
	
	public static void additionB(int a , int b) {
		System.out.println(a+b);
	}
	
	// function with parameter and with return 
	
	public static int additionC(int x , int y) {
			return x + y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
