package chapter06;

import java.util.Scanner;

/**
 * Number of days in a year
 * Write a method that returns the number of days in a year using the following header: 
 * public static int numberOfDaysInAYear(int year) 
 * Write a test program that displays the number of days in year from 2000 to 2020.
 *
 * 02/12/2017   8:19:39 AM
 *  
 * @author roman
 *
 *
 * Exercise_16
 *
 */
public class Exercise_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		System.out.print("Number of days: " + numberOfDaysInAYear(input.nextInt()));
		
		input.close();		
	}
	
	/**
	 * displays the number of days in year
	 * 
	 * @param year
	 * @return
	 */
	public static int numberOfDaysInAYear(int year) 
	{
		System.out.printf("%s %s\n", "Year", "Days");
		
		for (int i = 2000; i <= 2020; i++)
		{
			if (checkLeapYear(i))
				System.out.printf("%-5d %d \n", i, 366);
			else
				System.out.printf("%-5d %d \n", i, 365);
		}
		
		if (checkLeapYear(year))
			return 366;
		else
			return 365;
	}
	
	/**
	 * Returns true if year entered is a leap year
	 * 
	 * @param year
	 * @return
	 */
	public static boolean checkLeapYear(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
				if (year % 400 != 0)
					return false;
				else
					return true;
		}
		else
			return false;
		
		return true;
	}
}
