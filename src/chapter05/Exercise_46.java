package chapter05;

import java.util.Scanner;

/**
 * Reverse a String
 * Write a program that prompts the user to enter a string and displays the string in reverse order. 
 * 
 * 30/11/2017   10:17:17 AM
 *  
 * @author roman
 *
 *
 * Exercise_46
 *
 */
public class Exercise_46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		String reverse = "";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			reverse += s.charAt(i);
		}
		
		System.out.println(reverse);
		input.close();
	}

}
