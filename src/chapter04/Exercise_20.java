package chapter04;

import java.util.Scanner;

/**
 * Process a string
 * Write a program that prompts the user to enter a string and displays its length and its first character.
 *
 * 18/11/2017   10:58:32 PM
 *  
 * @author roman
 *
 *
 * Exercise_20
 *
 */
public class Exercise_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String processString = input.nextLine();
		
		System.out.print("Length: " + processString.length() + "\nFirst Character: " + processString.charAt(0));
		
		input.close();
	}

}
