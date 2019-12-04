package chapter04;

import java.util.Scanner;

/**
 * Find the Unicode of a character
 * Write a program that receives a character and displays its Unicode.
 * 
 * 18/11/2017   12:41:41 PM
 *  
 * @author romani
 *
 *
 * Exercise_09
 *
 */
public class Exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		int unicode = ch;
		System.out.println(unicode);
		
		input.close();
	}

}
