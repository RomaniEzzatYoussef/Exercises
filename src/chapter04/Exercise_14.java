package chapter04;

import java.util.Scanner;

/**
 * Convert letter grade to number
 * Write a program that prompts the user to enter a letter grade A, B, C, D, or F 
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0
 *
 * 18/11/2017   1:46:59 PM
 *  
 * @author roman
 *
 *
 * Exercise_14
 *
 */
public class Exercise_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter between A to F: ");
		char grade = input.next().charAt(0);
		
		if (grade == 'A')
			System.out.print("4");
		else if (grade == 'B')
			System.out.print("3");
		else if (grade == 'C')
			System.out.print("2");
		else if (grade == 'D')
			System.out.print("1");
		else 
			System.out.print("0");

		input.close();
	}

}
