package commom.com;

public class FatherSI {
	
	String firstName;
	String lastName;
	
	public FatherSI(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}
class SonS extends  FatherSI{
	
	String sName;

	public SonS(String firstName , String lastName, String sname) {
		super(firstName,lastName);
		this.sName = sname;
		
	}
	
	public void displayName() {
		System.out.println(this.sName + this.lastName);
		super.displayName();
	}

}

class DaughterS extends  FatherSI{
	
	String dName;

	public DaughterS(String firstName , String lastName, String dname) {
		super(firstName,lastName);
		this.dName = dname;
		
	}
	
	public void displayName() {
		System.out.println(this.dName + this.lastName);
		super.displayName();
	}

}

// Abtraction 
// Encapsulation 
// Static keyword


// BDD ---





