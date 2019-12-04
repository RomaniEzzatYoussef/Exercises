package RomaniTests.listingExamples;

import java.util.Scanner;

/**
 *
 * 10/03/2019   6:56:17 AM
 *  
 * @author Romani Ezzat
 *
 *
 * DisplayTime
 *
 */
public class DisplayTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
		
		input.close();
	}

}
