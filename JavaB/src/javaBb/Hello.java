package javaBb;

// public - access modifier
// class keyword
// clasName

// access modifier
// static - key 
// void  - does not return anything 
//  main()

public class Hello {
	
	
	public static void main(String[] args) {
		
		System.out.println("hello world");		
		//let x = 10 // number 
		//strongly type language

		 int x  =  100;
		 int y = 15;
		  
		 // Arithmetic operator
		 System.out.println(x+y);
		 System.out.println(x-y);
		 System.out.println(x*y);
		 System.out.println(x/y);
		 System.out.println(x%y);
		 
		 int s = 70;
		 int t = 35;
		 
		
		 System.out.println(s+t);
		 System.out.println(s-t);
		 System.out.println(s*t);	 
		 System.out.println(s/t);
		 System.out.println(s%t);
		 
		 // calling the method
		 Calculator(10,4);
		 Calculator(100,25);
		 
		 Addition();
		 Addition();
		 Addition();
		 Addition();
		 Addition();
		 
		 Addition(12,4);  //16
		 Addition(12,14); //26
		 
		 int a1 = Addition(23,44,55);
		 System.out.println(a1);
		 
		 
		 
		 // comparison operator
		 
		 System.out.println(5 < 6);
		 System.out.println(51 > 6);
		 System.out.println(6 == 6);
		 System.out.println(5 != 6);
		 System.out.println(5 <= 6);
		 System.out.println(5 >= 6);
		 System.out.println(8 == 8);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	
	// function without parameter and without return type
	public static void Addition() {
		System.out.println(9+9);
	}
	
	// function with parameter and with return type 
	
	public static void Addition(int x , int y) {
		System.out.println(x+y);
	}
	
	public static int Addition(int x,int y ,int z){
		return  x+ y+ y;
	}
	
	
	// comparison operator 
	// < , > , <= , >= , != , ==
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
