package chapter05;

import java.util.Scanner;

/**
 * Process string
 * Write a program that prompts the user to enter a string and displays the characters at odd positions.
 * Beijing Chicago
 * BiigCiao
 * 
 * 30/11/2017   11:05:00 AM
 *  
 * @author roman
 *
 *
 * Exercise_48
 *
 */
public class Exercise_48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String processString = input.nextLine();
		
		for (int i = 0; i < processString.length(); i++)
			if (i % 2 == 0)
				System.out.print(processString.charAt(i));
		
		input.close();
	}

}
