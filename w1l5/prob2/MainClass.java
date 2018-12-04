package w1l5.prob2;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Professor p1 = new Professor("Jhon", 1000.0, 10);
		Professor p2 = new Professor("Anna", 1000.0, 10);
		Professor p3 = new Professor("Makda", 1000.0, 10);
		
		Secretary s1 = new Secretary("Abiail", 1000, 1);
		Secretary s2 = new Secretary("Veronica", 1000, 1);
		
		DeptEmployee[] employees = {p1,p2, p3, s1, s2};
		double totalSalary = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Enter Y to see reult");
		
		String choice = scanner.nextLine();
		
		if(choice.equalsIgnoreCase("Y")) {
			for(DeptEmployee e: employees) {
				
				totalSalary += e.computeSalary(); 
			}
			System.out.println("Total Salary is " + totalSalary);
			
		}
		
	}

}
