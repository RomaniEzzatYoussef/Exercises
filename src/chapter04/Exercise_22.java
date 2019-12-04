package chapter04;

import java.util.Scanner;

/**
 * Check substring
 * Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
 *
 * 18/11/2017   11:20:13 PM
 *  
 * @author roman
 *
 *
 * Exercise_22
 *
 */
public class Exercise_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		if (s1.contains(s2))
			System.out.print(s1 + " contains " + s2);
		else
			System.out.print(s1 + " does not contain " + s2);
		
		input.close();
	}

}
