package chapter04;

import java.util.Scanner;

/**
 * Find the character of an ASCII code
 * Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
 *
 * 18/11/2017   12:38:46 PM
 *  
 * @author roman
 *
 *
 * Exercise_08
 *
 */
public class Exercise_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 127: ");
		int asciiCode = input.nextInt();
		
		char asciiChar = (char) asciiCode;
		System.out.print(asciiChar);
		
		input.close();
	}

}
