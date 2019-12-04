package listingExamples;

import java.util.Scanner;

/**
 *
 * 12/03/2019   12:47:26 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestBooleanOperators
 *
 */
public class TestBooleanOperators
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		if (number % 2 == 0 && number % 3 == 0)
			System.out.println(number + " is divisible by 2 and 3.");
		
		if (number % 2 == 0 || number % 3 == 0)
			System.out.println(number + " is divisible by 2 or 3.");
		
		if (number % 2 == 0 ^ number % 3 == 0)
			System.out.println(number + " is divisible by 2 or 3, but not both.");
	}

}
