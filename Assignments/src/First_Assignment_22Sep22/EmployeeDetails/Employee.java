/*4.) Write a program which will provide the support to sort a list of employee object using any of its attributes.
Employee: first name, last name, age, designation, salary
Given the option to the user to select by which attribute, they want sorting......
 */
package First_Assignment_22Sep22.EmployeeDetails;

public class Employee {
	private String FirstName;
	private String LastName;
	private int age;
	private String Designation;
	private int Salary;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee(String firstName, String lastName, int age, String designation, int salary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
		Designation = designation;
		Salary = salary;
	}
	@Override
	public String toString() {
		
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + ", Designation="
				+ Designation + ", Salary=" + Salary + "]";
		
	}
	
	
	

}
