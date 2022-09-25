package First_Assignment_22Sep22.EmployeeDetails;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
	

}
