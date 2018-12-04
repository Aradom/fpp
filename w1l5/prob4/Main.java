package w1l5.prob4;

public class Main {

	public static void main(String[] args) {
		double totalSalaryOfEmployees = 0;
		
		Employee[] employees = new Employee[5];
		employees[0] = new ComissionEmployee("Selam", "Reta", "sz3sfd", 42, 55);
		employees[1] = new HourlyEmployee("Rachel", "Kbret", "zADssfd", 15, 31);
		employees[2] = new SalariedEmployee("Bjarne", "Straustrup", "zADssfd", 1531);
		employees[3] = new BasePlusComissionEmployee("Dennis", "Richie", "zADssfd", 200,15, 31);
		employees[4] = new BasePlusComissionEmployee("Chandra", "Sakarn", "AADssfd", 200,15, 31);
		
		for(Employee e : employees) {
			totalSalaryOfEmployees += e.getPayment();
			System.out.println();
			System.out.println(e.toString());
		}
		System.out.println();
		System.out.println("The total salary of all the employees is: " + totalSalaryOfEmployees);

	}

}
