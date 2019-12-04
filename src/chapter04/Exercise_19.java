package chapter04;

import java.util.Scanner;

/**
 * Business: check ISBN-10
 * Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
 *
 * 18/11/2017   10:55:00 PM
 *  
 * @author roman
 *
 *
 * Exercise_19
 *
 */
public class Exercise_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the ISBN number ");
		String isbnString = input.next();
		
		int d1 = Character.getNumericValue(isbnString.charAt(0));
		int d2 = isbnString.charAt(1) - 48;
		int d3 = isbnString.charAt(2) - 48;
		int d4 = isbnString.charAt(3) - 48;
		int d5 = isbnString.charAt(4) - 48;
		int d6 = isbnString.charAt(5) - 48;
		int d7 = isbnString.charAt(6) - 48;
		int d8 = isbnString.charAt(7) - 48;
		int d9 = isbnString.charAt(8) - 48;
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 >= 10)
			System.out.print(isbnString + 'X');
		else
			System.out.print(isbnString + d10);
		
		input.close();
	}

}
