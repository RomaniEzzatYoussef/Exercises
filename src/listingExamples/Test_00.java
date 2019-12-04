package listingExamples;

import java.util.Scanner;

/**
 *
 * 11/03/2019   8:11:09 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_00
 *
 */
public class Test_00 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int digit = input.nextInt();
		
		int sum = (digit % 10);
		digit /= 10;
		
		sum += (digit % 10) + (digit /= 10);
		
		System.out.println("The sum is: " + sum);
		System.out.println("digit is: " + digit);
		
		input.close();
	}

}
