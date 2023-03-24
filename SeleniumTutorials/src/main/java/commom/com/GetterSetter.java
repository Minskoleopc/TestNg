package commom.com;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D(100);
		System.out.println(d.a);
		d.SetA(300);
		System.out.println(d.a);
		int q = d.GetA();
		System.out.println(q);
	}
	
}


class D {
	
	//int a = 10;
	
	int a;
	
	public D(int val1) {
		this.a = val1;
	}
	
	// setter value
	public int SetA(int val2) {
		this.a = val2;
		return a;
	}
	
	// getter value
	public int GetA() {
		return a;
	}
	
	
	
	
}