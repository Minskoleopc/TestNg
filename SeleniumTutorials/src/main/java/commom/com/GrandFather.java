package commom.com;
public class GrandFather {
	
	// Interitance multi-level
	
	String firstName;
	String lastName;

	public GrandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class Father extends GrandFather {

	String fatherName;
	public Father(String fn, String ln , String fatherName) {
		super(fn, ln);
		this.fatherName = fatherName;
	}
	
	public void displayFatherName() {
		System.out.println(this.fatherName+this.firstName+this.lastName);
	}
	
}
class Son extends Father {

	String sname;
	public Son(String fn, String ln, String fatherName,String sn) {
		super(fn, ln, fatherName);
		this.sname = sn;
	}
	public void displaySonName() {
		System.out.println(this.sname+this.lastName);
	}
	
}



// Object of son ----- yes 
// son will properties --- sname , firstName , lastName , fatherName 
// son can call method - displayName , displayFatherName , displaySonName(


// Single Inheritance 

// Father ---- son and daughter



