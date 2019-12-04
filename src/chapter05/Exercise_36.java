package chapter05;

import java.util.Scanner;

/**
 * Business application: checking ISBN
 * Use loops to simplify Programming Exercise 3.9.
 * 
 * 30/11/2017   8:15:41 AM
 *  
 * @author roman
 *
 *
 * Exercise_36
 *
 */
public class Exercise_36 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println(Character.getNumericValue('j'));
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 9 digit number: ");
		String isbn = input.next();
		
		int checksum = 0;
		
		for (int i = 0; i <= 8; i++)
		{
			System.out.println(isbn.charAt(i) + " * " + (i + 1) + " = " + (Character.getNumericValue(isbn.charAt(i)) * (i + 1)));
			checksum += Character.getNumericValue(isbn.charAt(i)) * (i + 1);
		}
		
		if ((checksum % 11) == 10)
			System.out.println("Your ISBN number is: " + isbn + 'X');
		else
			System.out.println("Your ISBN number is: " + isbn + (checksum % 11));
		
		input.close();
	}

}
