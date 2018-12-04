package w1l5.prob2;

public class Secretary extends DeptEmployee{
	double overtimeHours;
	
	public Secretary() {
		super();
	}
	
	public Secretary(String name, double salary, double overtime) {
		super(name, salary);
		this.overtimeHours = overtime;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	
	double computeSalary() {
		double secratarySalary = super.computeSalary() +  overtimeHours*12;
		return secratarySalary;
	}
}
