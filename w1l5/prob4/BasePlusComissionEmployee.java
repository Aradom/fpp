package w1l5.prob4;

public class BasePlusComissionEmployee extends ComissionEmployee {
	
	double 	baseSalary;
	
	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		this.baseSalary = baseSalary;
	}



	@Override
	public double getPayment() {
		return (baseSalary + (getGrossSales() * getComissionRate())); 
	}
	

}
