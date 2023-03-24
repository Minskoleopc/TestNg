package commom.com;

public class AccessModifiersB  extends C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C c = new C();
//		c.msg();		
		
		
		C.msg3();
	}

}

class C {

	protected void msg() {
		System.out.println("I am protected");
	}
	
	public void msg2() {
		System.out.println("I am public");
	}
	
	public static void msg3() {
		System.out.println("I am static");
	}
}
