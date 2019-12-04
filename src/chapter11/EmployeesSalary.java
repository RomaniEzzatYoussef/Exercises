package chapter11;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * 29/04/2019   6:12:56 PM
 *  
 * @author Romani Ezzat
 *
 *
 * EmployeesSalary
 *
 */
public class EmployeesSalary 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		float salary = 0 , newSalary , percentage;
		String message = "";
		do {
			String s = JOptionPane.showInputDialog("Enter your salary: ");
			for (int i = 0; i < s.length(); i++)
			{
				if (Character.isDigit(s.charAt(i)))
					salary = Float.parseFloat(s);
				else
					salary = 0;
			}
			
			newSalary = salary;
			
			if (salary > 0 && salary <= 400.00)
			{
				newSalary += (salary * 0.15);
				percentage =  0.15f;
			}
			
			else if (salary >= 400.01 && salary <= 800.00)
			{
				newSalary += (salary * 0.12);
				percentage = 0.12f;
			}
			
			else if (salary >= 800.01 && salary <= 1200.00)
			{
				newSalary += (salary * 0.10);
				percentage = 0.10f;
			}
			
			else if (salary >= 1200.01 && salary <= 2000.00)
			{
				newSalary += (salary * 0.07);
				percentage = 0.07f;
			}
			
			else
			{
				newSalary += (salary * 0.04);
				percentage = 0.04f;
			}
			
		} while (salary <= 0);
		
		float moneyEarned = newSalary - salary;
		
		message += "New Salay: " + newSalary;
		message += "\nMoney Earned: " + Math.round(moneyEarned);
		message += "\nIn Percentage: " + Math.round(percentage *100)+ " %";
		
		JOptionPane.showMessageDialog(null, message);
		input.close();
	}

}
