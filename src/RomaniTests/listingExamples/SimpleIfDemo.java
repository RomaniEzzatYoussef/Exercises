package RomaniTests.listingExamples;

import java.util.Scanner;

/**
 *
 * 12/03/2019   9:17:47 AM
 *  
 * @author Romani Ezzat
 *
 *
 * SimpleIfDemo
 *
 */
public class SimpleIfDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if (num % 5 == 0)
			System.out.println("Hi Five");
		if (num % 2 == 0)
			System.out.println("Hi Even");
		
		
		input.close();
	}

}
