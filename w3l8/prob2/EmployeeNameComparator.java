package w3l8.prob2;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		if(o1.getEmployeeName().compareTo(o2.getEmployeeName()) != 0) {
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
		else if(Double.compare(o1.getSalesAmount(), o2.getSalesAmount()) != 0) {
			return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
		}
		return o1.getEmployeeName().compareTo(o2.getProductName());
	}
}
