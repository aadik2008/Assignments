/*
 
 4.) Write a program which will provide the support to sort a list of employee object using any of 
     its attributes.
Employee: first name, last name, age, designation, salary
Given the option to the user to select by which attribute, they want sorting...... 

 */

package First_Assignment_22Sep22.EmployeeDetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingBasedOn {
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee( "Aditya",  "Kumar",  26,  "Consultant",  45000));
		emp.add(new Employee("Asif", "Khan", 25, "Consultant", 45000));
		emp.add(new Employee("Aakash","Singh",31,"Senior Consultant",89000));
		emp.add(new Employee("Sweta","Gupta",32,"Vice President",150000));
		emp.add(new Employee("Shivam","Singh",27,"Assosiate Engineer",38000));
		emp.add(new Employee("Harshit","Arora",39,"President",250000));
		emp.add(new Employee("Anjali","Mani",24,"Java Consultant",50000));
		emp.add(new Employee("Ankita","Gupta",23,"Management Trainee",28000));
		
		System.out.println("Press 1 if you want to Sort according to Employee's First name");
		System.out.println("Press 2 if you want to Sort according to Employee's Last name");
		System.out.println("Press 3 if you want to Sort according to Employee's Age");
		System.out.println("Press 4 if you want to Sort according to Employee's Designation");
		System.out.println("Press 5 if you want to Sort according to Employee's Salary");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();  
		    switch(number){  
		    case 1: Collections.sort(emp,new FirstNameComparator());
			System.out.println(emp);
		    break;  
		    case 2: Collections.sort(emp,new LastNameComparator());
			System.out.println(emp); 
		    break;  
		    case 3: Collections.sort(emp,new AgeComparator());
			System.out.println(emp);
		    break; 
		    case 4: Collections.sort(emp,new DesignationComparator());
			System.out.println(emp); 
		    break; 
		    case 5: Collections.sort(emp,new SalaryComparator());
		    System.out.println(emp);
		    break; 
		    //Default case statement  
		    default:System.out.println("Please press valid option");  
		    }  
	}
}
