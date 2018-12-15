package w3l11.prob2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		
		List<Employee> empsWithSoc = new ArrayList<>();
		for(String empKey: table.keySet()) {
			Employee sEmployee = table.get(empKey);
			if(socSecNums.contains(sEmployee.getSsn()) && sEmployee.getSalary() > 80000) {
				empsWithSoc.add(sEmployee);
			}
		}
		
		Collections.sort(empsWithSoc, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSsn().compareTo(o2.getSsn());
			}
			
		});
		
		return empsWithSoc;
		
	}
	
}
