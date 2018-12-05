package w1l5.prob2;

import java.time.LocalDate;
import java.util.Date;

public class DeptEmployee {
	String name;
	double salary;
	LocalDate hierDate;


	public DeptEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.hierDate = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHierDate() {
		return hierDate;
	}

	public void setHierDate(LocalDate hierDate) {
		this.hierDate = hierDate;
	}

	double computeSalary() {
		return salary;
	}
}
