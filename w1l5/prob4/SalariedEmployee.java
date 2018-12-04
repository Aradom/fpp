package w1l5.prob4;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName,
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	

	@Override
	public double getPayment() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		String superString = super.toString();
		return superString + "Weekly Salary: " + weeklySalary;
	}

}
