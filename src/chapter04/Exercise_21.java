package chapter04;

import java.util.Scanner;

/**
 * Check SSN
 * Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. 
 * Your program should check whether the input is valid.
 *
 * 18/11/2017   11:00:16 PM
 *  
 * @author roman
 *
 *
 * Exercise_21.txt
 *
 */
public class Exercise_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your SSN: ");
		String ssn = input.next();
		
		if (ssn.length() == 11)
		{
			if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-')
			{
				if (Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2))
						&& Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5)) && Character.isDigit(ssn.charAt(7))
						&& Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9))&& Character.isDigit(ssn.charAt(10)))
					System.out.print("Correct SSN!");
			}
		}
		else
			System.out.print("Incorrect SSN!");
		
		input.close();
	}

}
