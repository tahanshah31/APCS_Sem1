/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee Pam = new Employee(1987, "Pam", "Beesly", 2250);
		Employee Kelly = new Employee(4291, "Kelly", "Kapoor", 8901.90);
		
		Dwight.raiseSalary(21);
		Jim.raiseSalary(15);
		Pam.raiseSalary(30);
		Kelly.raiseSalary(3000);
		
		double salary1 = Dwight.getAnnualSalary();
		double salary2 = Jim.getAnnualSalary();
		double salary3 = Pam.getAnnualSalary();
		double salary4 = Kelly.getAnnualSalary();
		
		Dwight.employeeToString();
		System.out.println(salary1);
		
		Jim.employeeToString();
		System.out.println(salary2);
		
		Pam.employeeToString();
		System.out.println(salary3);
		
		Kelly.employeeToString();
		System.out.println(salary4);
		
	}
}
