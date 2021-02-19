package labrecord.exceptionhandling.com.cg.eis.entities;

import java.util.Scanner;

import labrecord.exceptionhandling.com.cg.eis.exception.EmployeeException;

public class Employee {

	public static void main(String[] args) {
		Employee app = new Employee();
		app.start();

	}
	
	void start() {
		int salary;
		System.out.println("Enter Salary: ");
		Scanner scan = new Scanner(System.in);
		salary = scan.nextInt();
		try {
			if(salary < 3000) {
				throw new EmployeeException("Your salary is less than 3000");
			}
		}catch(EmployeeException e) {
			System.out.print(e.getMessage());
		}catch(Exception e) {
			System.out.print("Something went wrong");
		}
	}

}
