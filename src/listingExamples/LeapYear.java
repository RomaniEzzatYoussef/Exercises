package listingExamples;

import java.util.Scanner;

/**
 *
 * 13/03/2019   8:16:41 AM
 *  
 * @author Romani Ezzat
 *
 *
 * LeapYear
 *
 */
public class LeapYear 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 // Create a Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a year: ");
	    int year = input.nextInt();
	    input.close();
	    // Check if the year is a leap year 
	    boolean isLeapYear = 
	      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	    // Display the result in a message dialog box
	    System.out.println(year + " is a leap year? " + isLeapYear); 
	}

}
