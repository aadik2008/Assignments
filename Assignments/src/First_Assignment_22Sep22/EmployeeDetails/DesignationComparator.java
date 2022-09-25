package First_Assignment_22Sep22.EmployeeDetails;

import java.util.Comparator;

public class DesignationComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDesignation().compareTo(o2.getDesignation());
	}
	
}
