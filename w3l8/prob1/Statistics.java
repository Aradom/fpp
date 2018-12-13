package w3l8.prob1;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumOfSalay = 0;
		
		for(EmployeeData eData:aList) {
			sumOfSalay += eData.getSalary();
		}
		return sumOfSalay;
	}
}
