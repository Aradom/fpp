package w1l5.prob4;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
		
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public abstract double getPayment();	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override 
	public String toString() {
		return "First Name: " + firstName + "Last Name: " +  lastName + 
				"Social Security Number: " + socialSecurityNumber;
	}
	

}
