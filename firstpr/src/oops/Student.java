package oops;

public class Student {
	
	int rollNo;
	String name;
	int marks;
	
	void display() {
		System.out.println("Roll number :  " + rollNo);
		System.out.println("Name :  " + name);
		System.out.println("Marks : " + marks);
	}
	void calculateGrade() {
		
		if(marks >= 90) {
			System.out.println("Grade A");
		}
		else if(marks >= 75){
			System.out.println("Grade B");
		}
		else if(marks >= 60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Better luck next time");
		}
		}
	}
