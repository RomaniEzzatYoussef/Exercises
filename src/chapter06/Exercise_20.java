package chapter06;

import java.util.Scanner;

/**
 * Count the letters in a string
 * Write a method that counts the number of letters in a string using the following header: 
 * public static int countLetters(String s) 
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 *
 * 02/12/2017   8:34:10 AM
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
		System.out.print("Number of letters are " + countLetters(input.nextLine()));
		
		input.close();		
	}
	
	/**
	 * counts the number of letters in a string
	 * 
	 * @param s
	 * @return
	 */
	public static int countLetters(String s) 
	{
		int letterCounter = 0;
		
		for (int i = 0; i < s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				letterCounter++;
		
		return letterCounter;
	}
}
