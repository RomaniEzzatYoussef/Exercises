package listingExamples;

import java.util.Scanner;

/**
 *
 * 11/03/2019   8:24:52 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_01
 *
 */
public class Test_01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
	
		int years = ((minutes / 60) / 24) / 365;
		int days =  ((minutes / 60) / 24) % 365;
		
		
		System.out.print(minutes + " minutes is approximately " + years + " years and "+ days + " days.");
		input.close();
	}

}
