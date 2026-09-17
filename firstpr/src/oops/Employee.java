package oops;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	static String companyName; 
	
	Employee(int empId, String empName, int salary){
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
	}
	void displayEmployee() {
		System.out.println("Emp id:  " + empId);
		System.out.println("Emp name: " + empName);
		System.out.println("Emp salary: " + salary);
		System.out.println("Company name: " + companyName);
		}
	}

