package oops;

public class Manager extends Employee{
	String department;
	int teamSize;
	
	Manager(int empId, String empName, int salary, String department, int teamSize){
		
		super(empId, empName, salary);
		
		this.department = department;
		this.teamSize = teamSize;
		}
	void displayManger() {
		displayEmployee();
		
		System.out.println("Department : " + department);
		System.out.println("Team size : " + teamSize);
	}
	
	void calculate() {
		int annualSal = salary * 12;
		System.out.println("Annual salary: " + annualSal);
		
	}

}
