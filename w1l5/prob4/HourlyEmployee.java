package w1l5.prob4;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
		
	}



	@Override
	public double getPayment() {
		return wage*hours;
	}
	
	@Override
	public String toString() {
		String parentString = super.toString();
		return parentString + "Wage: " + wage + "hours " + hours ;
	}

}
