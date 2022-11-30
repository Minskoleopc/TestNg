package commom.com;

public class Polymorphism {

	
	// same class , same methodName , different signature
	
	public static void Addition(int x , int y) {
		System.out.println(x + y);
	}
	public static void Addition(int x , int y , int z) {
		System.out.println(x + y+ z);
	}
	
	public static void Addition(int x , int y , int z , int q) {
		System.out.println(x + y+ z+q);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Addition(12,13);
		Addition(12,13,34);
		Addition(12,13,34,34);
		
	}

	
	
	
	
}
