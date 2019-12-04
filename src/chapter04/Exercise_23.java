package chapter04;

import java.util.Scanner;

/**
 * Financial application: payroll
 * Write a program that reads the following information and prints a payroll statement:
 * Employee’s name (e.g., Smith) 
 * Number of hours worked in a week (e.g., 10) 
 * Hourly pay rate (e.g., 9.75) 
 * Federal tax withholding rate (e.g., 20%) 
 * State tax withholding rate (e.g., 9%)
 *
 * 18/11/2017   11:21:30 PM
 *  
 * @author roman
 *
 *
 * Exercise_23
 *
 */
public class Exercise_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String empName = input.next();
		
		System.out.print("Number of hours worked in a week: ");
		int hoursWorked = input.nextInt();
		
		System.out.print("Enter hourly payrate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding: ");
		double fedTax = input.nextDouble() / 100.0;
		
		System.out.print("Enter state tax withholding: ");
		double stateTax = input.nextDouble() / 100.0;
		
		double wage = hoursWorked * payRate;
		
		System.out.print("Name: " + empName + 
				"\nWage before tax deduction:" + wage +
				"\nFederal Tax Withholding rate: " + (wage * fedTax) +
				"\nState Tax Withholding rate: " + (wage * stateTax) + 
				"\nWage after tax deduction: " + ((wage - (wage * fedTax)) - (wage * stateTax)));
		
		
		input.close();
	}

}
