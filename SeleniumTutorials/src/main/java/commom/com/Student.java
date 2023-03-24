package commom.com;

public class Student {

	String firstName;
	String lastName;
	int SSN;

	public Student(String firstName, String lastName, int SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class Teacher extends Student{
	int salary;
	public Teacher(String firstName, String lastName, int SSN , int salary) {
		super(firstName, lastName, SSN);
		this.salary = salary;	
	}
	@Override
	public void displayName() {
		System.out.println("Mr"+this.firstName + this.lastName);
	}
	
}