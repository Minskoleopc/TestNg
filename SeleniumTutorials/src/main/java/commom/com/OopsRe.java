package commom.com;

public class OopsRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsRe cal = new OopsRe();
		cal.addition(1, 2);
		cal.addition(1, 2,3);
		cal.addition(1, 2,3,6);
		
		Teacher chinmay = new Teacher("chinmay", "deshpande", 123, 10000);
		
		// 4 properies
		
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.SSN);
		System.out.println(chinmay.salary);
		
	
		// 1 Method
		chinmay.displayName();
		
		
		// Inheritance
		
		Son chi = new Son("manohar","deshpande","shirish","chinmay");
		chi.displayFatherName();
		chi.displayName();
		chi.displaySonName();
		

	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	// Polymorphism
	// Overloading , Overriding
	// Overloading - same class , same methodName , different signature
	// Overriding - differentClass , sameMethod , same signature

	// Type
	// Types ====> Object
	// Object will have propteries and method
	// method will have action and return type

	// Class ---- user defined data type
	// with that you create objects
	// Defining class itself is Encapsulation

	// 4 better ways to write class

	// Encapsulation
	// Inheritance
	// Polymorphism
	// Abstraction

}
